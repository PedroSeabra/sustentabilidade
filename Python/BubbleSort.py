def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                # Troca
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
    return arr

if __name__ == "__main__":
    import sys
    # Read all input at once and convert to integers
    input_data = sys.stdin.read().split()
    arr = list(map(int, input_data))
    arr = bubble_sort(arr)
