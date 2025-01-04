def solution(arr, k):
    arrSet = []
    
    for i in arr:
        if i not in arrSet:
            arrSet.append(i)
    
    arr = arrSet[:k]
    
    while len(arr) < k:
        arr += [-1]
    
    return arr