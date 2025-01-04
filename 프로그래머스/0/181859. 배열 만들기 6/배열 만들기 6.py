def solution(arr):
    answer = []
    
    for idx, i in enumerate(arr):
        if len(answer) == 0:
            answer.append(i)
        elif answer[-1] == i:
            answer.pop()
        elif answer[-1] != i:
            answer.append(i)
    
    return answer if answer else [-1]