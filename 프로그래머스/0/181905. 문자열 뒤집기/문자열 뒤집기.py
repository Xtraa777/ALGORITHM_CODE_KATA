def solution(my_string, s, e):
    strn = list(my_string)
    
    strn[s:e+1] = strn[s:e+1:][::-1]
    answer = ''.join(strn)
    
    return answer