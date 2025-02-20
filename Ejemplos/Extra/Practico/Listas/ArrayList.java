package proyecto1;

import java.util.ArrayList;

public class Proyecto1 {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Ana");
        nombres.add("Juan");
        nombres.add("Luis");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
