def solution(arr, flag):
    answer = []
    arrFlag = list(zip(arr, flag))

    for key, value in arrFlag:
        if value == True:
            for _ in range(key):
                answer.append(key)
                answer.append(key)
        else:
            for _ in range(key):
                answer.pop()
    
    return answer