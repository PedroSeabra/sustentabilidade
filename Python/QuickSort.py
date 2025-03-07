def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[0]
        less_than_pivot = [x for x in arr[1:] if x <= pivot]
        greater_than_pivot = [x for x in arr[1:] if x > pivot]
        return quick_sort(less_than_pivot) + [pivot] + quick_sort(greater_than_pivot)

if __name__ == "__main__":
    import sys
    input = sys.stdin.read
    data = input().split()
    arr = list(map(int, data))
    sorted_arr = quick_sort(arr)
    # print(" ".join(map(str, sorted_arr)))
