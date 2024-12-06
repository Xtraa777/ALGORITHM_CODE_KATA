def solution(l, r):
    answer = []
    
    l -= l % 5
    
    for i in range(l, r+1, 5):
        if not set(str(i)) - set(['0', '5']):
            answer.append(i)
            
    return answer if answer else [-1]