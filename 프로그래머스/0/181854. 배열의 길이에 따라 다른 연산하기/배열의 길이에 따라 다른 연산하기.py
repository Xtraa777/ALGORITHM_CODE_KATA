def solution(arr, n):
    if len(arr) % 2 == 0:
        arr[1::2] = [i + n for i in arr[1::2]]
    else:
        arr[::2] = [i + n for i in arr[::2]]
    
    return arr