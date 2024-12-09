def solution(my_string, index_list):
    answer = ''
    
    str = list(my_string)
    
    for i in index_list:
            answer += str[i]
    
    return answer