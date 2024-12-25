def solution(myString, pat):
    answer = ''
    
    for i in range(len(myString) + 1):
        sliced = myString[:i]
        if sliced.endswith(pat):
            answer = sliced
            
    return answer