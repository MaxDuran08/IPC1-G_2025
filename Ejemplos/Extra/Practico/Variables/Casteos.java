package proyecto1;

public class Proyecto1 {

    public static void main(String[] args) {
        // Implícito
        int num = 10;
        double numDecimal = num;

        // Explícito
        double otroDecimal = 9.99;
        int otroNum = (int) otroDecimal;

        System.out.println("Casteo implícito: " + numDecimal);
        System.out.println("Casteo explícito: " + otroNum);
    }

}
