package proyecto1;

public class Proyecto1 {

    public static void quickSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = particion(arreglo, inicio, fin);
            quickSort(arreglo, inicio, pivote - 1);
            quickSort(arreglo, pivote + 1, fin);
        }
    }

    private static int particion(int[] arreglo, int inicio, int fin) {
        int pivote = arreglo[fin];
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (arreglo[j] < pivote) {
                i++;
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[fin];
        arreglo[fin] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arreglo = {5, 3, 8, 1, 2};
        quickSort(arreglo, 0, arreglo.length - 1);

        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
}
