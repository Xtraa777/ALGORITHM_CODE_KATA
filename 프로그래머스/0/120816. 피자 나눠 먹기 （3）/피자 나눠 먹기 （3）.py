def solution(slice, n):
    answer = 0
    pizza = slice
    
    while n > pizza * answer:
        answer += 1

    return answer