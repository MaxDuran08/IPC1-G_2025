package proyecto1;

public class Proyecto1 {

    public static void main(String[] args) {
        int[] arreglo = {5, 3, 8, 1, 2};

        for (int i = 1; i < arreglo.length; i++) {
            int clave = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > clave) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = clave;
        }

        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
}
