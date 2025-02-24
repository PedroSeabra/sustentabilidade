import java.util.Scanner;

public class QuickSort {
    // Método para trocar elementos no array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Método para particionar o array
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    // Método principal que implementa o QuickSort
    public static void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
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
        sort(arr, 0, n - 1);
        // Imprime os elementos ordenados
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
    }
}
