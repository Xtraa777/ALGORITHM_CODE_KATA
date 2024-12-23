def solution(num_list):
    answer = 0
    
    for i in num_list:
        while not i == 1:
            if i % 2 == 1:
                i = (i - 1) // 2
                answer += 1
            else:
                i //= 2
                answer += 1
    
    return answer