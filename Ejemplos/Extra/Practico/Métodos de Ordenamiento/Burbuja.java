package proyecto1;

public class Proyecto1 {

    public static void main(String[] args) {
        int[] arreglo = {5, 3, 8, 1, 2};

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
}
