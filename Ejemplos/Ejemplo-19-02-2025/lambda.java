/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipc1.g_2025.ejemplos;

/**
 *
 * @author Raxzorm
 */
public class IPC1G_2025Ejemplos {

    /**
     * @param args the command line arguments
     */
// Interfaz funcional
    @FunctionalInterface
    interface Operacion {
        int calcular(int a, int b);
    }

    public static void main(String[] args) {
        // Usando una expresión lambda para implementar la interfaz Operacion
        Operacion suma = (a, b) -> a + b;  // Lambda que suma dos números
        
        Operacion multiplicacion = (a, b) -> a * b; // Lambda que multiplica dos números
        
        // Usamos las lambdas
        System.out.println("Suma: " + suma.calcular(5, 3));  // Resultado: 8
        System.out.println("Multiplicación: " + multiplicacion.calcular(5, 3)); // Resultado: 15
    }
}