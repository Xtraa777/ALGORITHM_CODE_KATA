def solution(arr, queries):
    
    for i, j in queries:
        for a in range(i, j+1):
            arr[a] = arr[a] + 1

    return arr