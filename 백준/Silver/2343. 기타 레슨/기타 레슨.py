import sys
input = sys.stdin.readline

def bluray(arr, mid, m):
    bluray = 1
    bluraySum = 0
    
    for i in arr:
        if bluraySum + i > mid:
            bluray += 1
            bluraySum = i
        else:
            bluraySum += i
            
        if bluray > m:
            return False
        
    return True
    
def bs(arr, m):
    start = max(arr)
    end = sum(arr)
    result = 0
    
    while(start <= end):
        mid = (start + end) // 2
        
        if bluray(arr, mid, m):
            result = mid
            end = mid - 1
        else:
            start = mid + 1
    
    return result

n, m = map(int, input().split())
lectures = list(map(int, input().split()))

print(bs(lectures, m))