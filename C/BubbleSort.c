// BubbleSort.c
#include <stdio.h>

void bubbleSort(int arr[], int n) {
    int i, j, temp;
    for (i = 0; i < n - 1; i++) {
        for (j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Troca arr[j] e arr[j+1]
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++){
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int n;
    // Lê o número de elementos
    scanf("%d", &n);
    int arr[n];
    // Lê os elementos
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // printf("Array original:\n");
    // printArray(arr, n);
    
    bubbleSort(arr, n);
    
    // printf("Array ordenado (Bubble Sort):\n");
    // printArray(arr, n);
    return 0;
}
