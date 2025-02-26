/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Raxzorm
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 1. Crear un ArrayList
        ArrayList<String> nombres = new ArrayList<>();

        // 2. Agregar elementos
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Carlos");
        nombres.add("Ana");
        System.out.println("Lista de nombres: " + nombres);

        // 3. Acceder a elementos por índice
        String primerNombre = nombres.get(0);
        System.out.println("El primer nombre en la lista es: " + primerNombre);

        // 4. Modificar un elemento
        nombres.set(1, "Luisa"); // Cambia el segundo elemento (índice 1) de "Maria" a "Luisa"
        System.out.println("Lista después de la modificación: " + nombres);

        // 5. Eliminar un elemento por índice
        nombres.remove(2); // Elimina el elemento en el índice 2 (Carlos)
        System.out.println("Lista después de eliminar el elemento en el índice 2: " + nombres);

        // 6. Eliminar un elemento por valor
        nombres.remove("Ana"); // Elimina "Ana" de la lista
        System.out.println("Lista después de eliminar 'Ana': " + nombres);

        // 7. Verificar si un elemento existe en la lista
        boolean contieneJuan = nombres.contains("Juan");
        System.out.println("¿Contiene 'Juan'?: " + contieneJuan);

        // 8. Obtener el tamaño de la lista
        int tamaño = nombres.size();
        System.out.println("El tamaño de la lista es: " + tamaño);

        // 9. Iterar sobre los elementos usando un bucle for
        System.out.println("Iterando sobre la lista usando un bucle for:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }

        // 10. Iterar sobre los elementos usando un bucle foreach
        System.out.println("Iterando sobre la lista usando un bucle foreach:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // 11. Verificar si la lista está vacía
        boolean estaVacia = nombres.isEmpty();
        System.out.println("¿La lista está vacía?: " + estaVacia);

        // 12. Limpiar todos los elementos de la lista
        nombres.clear();
        System.out.println("Lista después de limpiar todos los elementos: " + nombres);

        // 13. Volver a agregar elementos
        nombres.add("Pedro");
        nombres.add("Sofia");
        nombres.add("David");
        System.out.println("Lista con nuevos elementos: " + nombres);

        // 14. Ordenar la lista
        Collections.sort(nombres); // Ordena los elementos alfabéticamente
        System.out.println("Lista ordenada: " + nombres);

        // 15. Comprobar si la lista contiene un elemento
        boolean contieneSofia = nombres.contains("Sofia");
        System.out.println("¿Contiene 'Sofia'?: " + contieneSofia);

        // 16. Obtener la posición de un elemento
        int indiceSofia = nombres.indexOf("Sofia");
        System.out.println("El índice de 'Sofia' es: " + indiceSofia);

        // 17. Sublista de un ArrayList (obtener una porción de la lista)
        List<String> subLista = nombres.subList(0, 2); // Obtiene una sublista de los primeros 2 elementos
        System.out.println("Sublista: " + subLista);
    
    }
    
}
