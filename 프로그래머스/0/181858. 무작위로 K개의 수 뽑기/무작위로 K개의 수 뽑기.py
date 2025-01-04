def solution(arr, k):
    arrSet = []
    
    for i in arr:
        if i not in arrSet:
            arrSet.append(i)
        if len(arrSet) == k:
            break
    
    arr = arrSet
    
    return arr + [-1] * (k - len(arr))