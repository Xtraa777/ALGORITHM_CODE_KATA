def solution(l, r):
    answer = []
    
    for i in range(l, r+1):
        check = True
        for s in str(i):
            if s != '5' and s != '0':
                check = False
                break
        if check:
            answer.append(i)
            
    return answer if answer else [-1]