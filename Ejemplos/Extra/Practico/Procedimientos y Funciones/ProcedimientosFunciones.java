package proyecto1;

public class Proyecto1 {

    // Procedimiento
    public static void mostrarMensaje() {
        System.out.println("Este es un procedimiento.");
    }

    // Función
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        mostrarMensaje();
        System.out.println("Suma: " + sumar(5, 7));
    }
}
