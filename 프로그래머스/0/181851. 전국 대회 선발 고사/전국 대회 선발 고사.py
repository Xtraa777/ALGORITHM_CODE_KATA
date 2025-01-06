def solution(rank, attendance):
    answer = 0
    
    check = [(r, idx) for idx, (r, atd) in enumerate(zip(rank, attendance)) if atd]
    
    check.sort()
    a, b, c = check[0][1], check[1][1], check[2][1]
    
    return 10000 * a + 100 * b + c