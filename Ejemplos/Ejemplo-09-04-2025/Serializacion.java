/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serializacion;

/**
 *
 * @author Raxzorm
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase Persona serializable
class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre='" + nombre + '\'' + ", edad=" + edad + '}';
    }
}

public class Serializacion {
    private static final String ARCHIVO = "personas.bin";
    private static List<Persona> personas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Agregar persona");
            System.out.println("2. Mostrar personas actuales");
            System.out.println("3. Serializar lista de personas");
            System.out.println("4. Vaciar lista en memoria");
            System.out.println("5. Cargar lista desde archivo");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    agregarPersona(scanner);
                    break;
                case 2:
                    mostrarPersonas();
                    break;
                case 3:
                    serializarPersonas();
                    break;
                case 4:
                    vaciarLista();
                    break;
                case 5:
                    deserializarPersonas();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no valida. Intenta de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }

    private static void agregarPersona(Scanner scanner) {
        System.out.print("Ingresa el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        personas.add(new Persona(nombre, edad));
        System.out.println("Persona agregada.");
    }

    private static void mostrarPersonas() {
        if (personas.isEmpty()) {
            System.out.println("La lista de personas esta vacia.");
        } else {
            System.out.println("Personas en la lista:");
            for (Persona persona : personas) {
                System.out.println(persona);
            }
        }
    }

    private static void serializarPersonas() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(personas);
            System.out.println("Lista de personas serializada correctamente.");
        } catch (IOException e) {
            System.out.println("Error al serializar la lista: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private static void deserializarPersonas() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO))) {
            personas = (List<Persona>) ois.readObject();
            System.out.println("Lista de personas deserializada correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al deserializar la lista: " + e.getMessage());
        }
    }

    private static void vaciarLista() {
        personas.clear();
        System.out.println("Lista vaciada.");
    }
}