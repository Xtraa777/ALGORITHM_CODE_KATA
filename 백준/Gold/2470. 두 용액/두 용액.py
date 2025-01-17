def tp(arr):
    start, end = 0, len(arr) - 1
    b = float('inf')
    result = (0, 0)
    
    while start < end:
        a = arr[start] + arr[end]
        
        if abs(a) < abs(b):
            b = a
            result = (arr[start], arr[end])
        
        if a < 0:
            start += 1
        elif a > 0:
            end -= 1
        else:
            break
            
    return result

import sys
input = sys.stdin.readline

n = int(input())
nList = sorted(list(map(int, input().split())))

result = tp(nList)
print(result[0], result[1])