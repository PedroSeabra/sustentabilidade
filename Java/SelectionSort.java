import java.util.Scanner;

// BubbleSort.java
public class SelectionSort {
        public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lê o número de elementos
        int n = scanner.nextInt();
        int[] arr = new int[n];
        // Lê os elementos
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        // System.out.println("Array original:");
        // printArray(arr);
        selectionSort(arr);
        // System.out.println("Array ordenado (Bubble Sort):");
        // printArray(arr);
    }
}
