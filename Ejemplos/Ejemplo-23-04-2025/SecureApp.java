/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secureapp;

import java.sql.*;
import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Raxzorm
 */
public class SecureApp {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/secure_app";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "root";

    private static final String SALT = "S3cr3tS@lt";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
            System.out.println("Conectado a MySQL.");
            boolean exit = false;

            while (!exit) {
                System.out.println("\n1. Registrar\n2. Iniciar sesion\n3. Salir");
                System.out.print("Opcion: ");
                String option = scanner.nextLine();

                switch (option) {
                    case "1":
                        registerUser(conn);
                        break;
                    case "2":
                        loginUser(conn);
                        break;
                    case "3":
                        exit = true;
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error en la base de datos.");
        }
    }

    private static void registerUser(Connection conn) {
        System.out.print("Nombre de usuario: ");
        String username = scanner.nextLine();

        if (!isValidUsername(username)) {
            System.out.println("Usuario inválido.");
            return;
        }

        System.out.print("Contraseña: ");
        String password = scanner.nextLine();

        String hashedPassword = hashPassword(password);

        String sql = "INSERT INTO users (username, password_hash) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, hashedPassword);
            stmt.executeUpdate();
            System.out.println("Usuario registrado.");
        } catch (SQLException e) {
            System.out.println("Error al registrar (¿ya existe?).");
        }
    }

    private static void loginUser(Connection conn) {
        System.out.print("Usuario: ");
        String username = scanner.nextLine();
        System.out.print("Contraseña: ");
        String password = scanner.nextLine();

        String sql = "SELECT password_hash, role FROM users WHERE username = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String storedHash = rs.getString("password_hash");
                String role = rs.getString("role");
                String enteredHash = hashPassword(password);

                if (storedHash.equals(enteredHash)) {
                    System.out.println("Bienvenido. Rol: " + role);
                    if ("ADMIN".equals(role)) {
                        System.out.println("Tienes acceso administrativo.");
                    }
                } else {
                    System.out.println("Contraseña incorrecta.");
                }
            } else {
                System.out.println("Usuario no encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión.");
        }
    }

    private static boolean isValidUsername(String username) {
        return username != null && username.matches("^[a-zA-Z0-9_]{3,20}$");
    }

    private static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest((SALT + password).getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Algoritmo SHA-256 no disponible.");
        }
    }
}