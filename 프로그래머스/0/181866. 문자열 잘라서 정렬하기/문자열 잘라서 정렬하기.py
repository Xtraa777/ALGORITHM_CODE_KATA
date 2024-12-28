def solution(myString):
    answer = []
    
    for i in myString.split('x'):
        if not i == '':
            answer.append(i)
            
    return sorted(answer)