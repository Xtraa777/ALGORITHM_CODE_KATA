def solution(my_strings, parts):
    answer = ''
    
    for idx, i in enumerate(parts):
        str = my_strings[idx]
        answer += str[i[0]:i[1]+1]
    
    return answer
