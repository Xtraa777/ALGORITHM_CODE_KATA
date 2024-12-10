def solution(my_string, is_suffix):
    answer = 0
    str = []
    
    for i in range(len(my_string)):
        str.append(my_string[i:])
        
    for i in str:
        if i == is_suffix:
            answer = 1
            break
    
    return answer
