import java.util.Scanner;

// BubbleSort.java
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Troca arr[j] e arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
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
        bubbleSort(arr);
        // System.out.println("Array ordenado (Bubble Sort):");
        // printArray(arr);
    }
}
