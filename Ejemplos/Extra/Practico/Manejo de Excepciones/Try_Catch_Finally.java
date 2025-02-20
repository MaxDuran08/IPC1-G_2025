package proyecto1;

public class Proyecto1 {

    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        } finally {
            System.out.println("Esto se ejecuta siempre.");
        }
    }

}
