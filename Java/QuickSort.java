import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
    if (low < high) {
        int pi = partition(array, low, high);
        quickSort(array, low, pi - 1);
        quickSort(array, pi + 1, high);
    }
}

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // Lê o número de elementos
        int n = scanner.nextInt();
        int arr[] = new int[n];
        // Lê os elementos
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        // Ordena o array
        quickSort(arr, 0, n - 1);
        // Imprime os elementos ordenados
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
    }
}
