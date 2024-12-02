def solution(a, b):
    
    ab = str(a) + str(b)
    ab2 = 2 * a * b
    
    answer = max(ab2, int(ab))
    return answer