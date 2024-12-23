def solution(arr):
    answer = 0
    
    while True:
        bp = 0
        
        for i in range(len(arr)):
            if arr[i] >= 50 and arr[i] % 2 == 0:
                arr[i] //= 2
            elif arr[i] < 50 and arr[i] % 2 == 1:
                arr[i] = arr[i] * 2 + 1
            else:
                bp += 1
        
        if bp == len(arr):
            break
        
        answer += 1
    
    return answer