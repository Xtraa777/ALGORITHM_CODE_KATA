def solution(arr):
    target = 1
    
    while len(arr) > target:
        target *= 2
    
    return arr + [0] * (target - len(arr))