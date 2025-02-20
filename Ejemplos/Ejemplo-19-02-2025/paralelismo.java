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
    public static void main(String[] args) {
        // Creamos dos hilos que se ejecutarán en paralelo
        Thread tarea1 = new Thread(() -> realizarTarea("Sprint 1"));
        Thread tarea2 = new Thread(() -> realizarTarea("Sprint 2"));

        // Iniciamos ambos hilos al mismo tiempo
        tarea1.start();
        tarea2.start();

        System.out.println("Las tareas se ejecutan en paralelo...");
    }

    // Método que simula una tarea pesada
    static void realizarTarea(String nombre) {
        System.out.println(nombre + " ha comenzado...");
        try {
            Thread.sleep(2000); // Simula una tarea que tarda 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nombre + " ha terminado.");
    }
}

