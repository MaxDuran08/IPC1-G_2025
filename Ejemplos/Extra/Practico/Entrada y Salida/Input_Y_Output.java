package proyecto1;

import java.util.Scanner;

public class Proyecto1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola, " + nombre);
        scanner.close();
    }

}
