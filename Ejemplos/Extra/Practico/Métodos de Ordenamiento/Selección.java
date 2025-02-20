package proyecto1;

public class Proyecto1 {

    public static void main(String[] args) {
        int[] arreglo = {5, 3, 8, 1, 2};

        for (int i = 0; i < arreglo.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arreglo[minIndex];
            arreglo[minIndex] = arreglo[i];
            arreglo[i] = temp;
        }

        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
}
