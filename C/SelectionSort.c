// BubbleSort.c
#include <stdio.h>

void swap(int* a, int* b) {
    int t = *a;
    *a = *b;
    *b = t;
}

void selectionSort(int arr[], int n) {
    int i, j, min_idx;
    for (i = 0; i < n - 1; i++) {
        min_idx = i;
        for (j = i + 1; j < n; j++) {
            if (arr[j] < arr[min_idx]) {
                min_idx = j;
            }
        }
        swap(&arr[min_idx], &arr[i]);
    }
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
    
    selectionSort(arr, n);
    
    // printf("Array ordenado (Bubble Sort):\n");
    // printArray(arr, n);
    return 0;
}
