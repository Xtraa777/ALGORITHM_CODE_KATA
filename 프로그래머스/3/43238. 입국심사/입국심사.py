def solution(n, times):
    def search(t):
        ret = 0
        for time in times:
            ret += t // time
        return ret
    
    left = 0
    right = n * min(times)
    
    while left < right:
        mid = (left + right) // 2
        s = search(mid)
        if s < n:
            left = mid + 1
        else:
            right = mid
            
    return left