def solution(num_list):
    answer = 0
    even = 0
    odd = 0
    
    for idx, i in enumerate(num_list):
        if idx % 2 == 0:
            even += i
        else :
            odd += i
    
    return even if even >= odd else odd