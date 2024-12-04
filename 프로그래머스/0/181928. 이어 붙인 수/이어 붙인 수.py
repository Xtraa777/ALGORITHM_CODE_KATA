def solution(num_list):
    answer = 0
    odd = ''
    even = ''
    
    for i in num_list:
        if i % 2:
            odd += str(i)
        else:
            even += str(i)
    
    return int(even) + int(odd)