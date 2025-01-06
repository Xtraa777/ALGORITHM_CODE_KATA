def solution(rank, attendance):
    check = [(i, idx) for idx, i in enumerate(rank) if attendance[idx]]
    
    check.sort()
    a, b, c = check[0][1], check[1][1], check[2][1]
    
    return 10000 * a + 100 * b + c