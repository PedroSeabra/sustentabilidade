def merge_sort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2  # Encontra o meio do array
        left_half = arr[:mid]  # Divide a lista na metade esquerda
        right_half = arr[mid:]  # Divide a lista na metade direita

        merge_sort(left_half)  # Ordena a metade esquerda
        merge_sort(right_half)  # Ordena a metade direita

        i = j = k = 0

        # Copia os dados para as listas left_half e right_half
        while i < len(left_half) and j < len(right_half):
            if left_half[i] < right_half[j]:
                arr[k] = left_half[i]
                i += 1
            else:
                arr[k] = right_half[j]
                j += 1
            k += 1

        # Verifica se algum elemento foi deixado
        while i < len(left_half):
            arr[k] = left_half[i]
            i += 1
            k += 1

        while j < len(right_half):
            arr[k] = right_half[j]
            j += 1
            k += 1

if __name__ == "__main__":
    import sys
    input = sys.stdin.read
    data = input().split()
    arr = list(map(int, data))
    merge_sort(arr)
    # print(" ".join(map(str, arr)))