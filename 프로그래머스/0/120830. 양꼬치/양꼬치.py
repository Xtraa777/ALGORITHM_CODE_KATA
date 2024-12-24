def solution(n, k):
    service = n // 10
    
    return 12_000 * n + 2_000 * (k - service)