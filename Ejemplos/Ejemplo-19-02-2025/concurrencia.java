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
    
    // Número de filosofos y tenedores
    static final int NUM_FILOSOFOS = 5;
    static final Object[] tenedores = new Object[NUM_FILOSOFOS]; // Cada tenedor es un objeto de sincronizacion
    
    public static void main(String[] args) {
        // Inicializamos los objetos que representan los tenedores
        for (int i = 0; i < NUM_FILOSOFOS; i++) {
            tenedores[i] = new Object();
        }

        // Creamos los hilos para cada filosofo
        for (int i = 0; i < NUM_FILOSOFOS; i++) {
            final int filosofo = i; // Necesario porque las variables en lambdas deben ser finales o efectivamente finales
            new Thread(() -> {
                while (true) {  // Ciclo infinito: los filosofos nunca dejan de pensar y comer
                    pensar(filosofo);
                    comer(filosofo);
                }
            }).start();
        }
    }

    // Método que simula que un filosofo esta pensando
    static void pensar(int filosofo) {
        System.out.println("Filosofo " + filosofo + " esta pensando...");
        dormir(1000); // Simula que el filosofo piensa por 1 segundo
    }

    // Método que simula que un filosofo esta comiendo
    static void comer(int filosofo) {
        int tenedorIzq = filosofo; // El tenedor izquierdo corresponde al índice del filosofo
        int tenedorDer = (filosofo + 1) % NUM_FILOSOFOS; // El tenedor derecho es el siguiente en la lista (circular)

        // Para evitar interbloqueo (deadlock), siempre tomamos primero el tenedor de menor índice
        synchronized (tenedores[Math.min(tenedorIzq, tenedorDer)]) {
            synchronized (tenedores[Math.max(tenedorIzq, tenedorDer)]) {
                System.out.println("Filosofo " + filosofo + " esta comiendo...");
                dormir(1000); // Simula el tiempo en que el filosofo come
            }
        }
    }

    // Método auxiliar para hacer que un hilo duerma
    static void dormir(int tiempo) {
        try {
            Thread.sleep(tiempo); // Hace que el hilo actual duerma por 'tiempo' milisegundos
        } catch (InterruptedException e) {
            e.printStackTrace(); // Manejo de excepciones si ocurre un error en el sleep
        }
    }
}
