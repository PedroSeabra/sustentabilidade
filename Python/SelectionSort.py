def selection_sort(arr):
    for i in range(len(arr)):
        min_index = i
        for j in range(i+1, len(arr)):
            if arr[j] < arr[min_index]:
                min_index = j
        arr[i], arr[min_index] = arr[min_index], arr[i]
    return arr

if __name__ == "__main__":
    import sys
    # Read all input at once and convert to integers
    input_data = sys.stdin.read().split()
    arr = list(map(int, input_data))
    arr = selection_sort(arr)
