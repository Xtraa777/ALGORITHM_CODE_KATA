def solution(arr):
    answer = []
    check = arr.count(2)
    cnt = 0
    
    if check == 0:
        return [-1]
    elif check == 1:
        return [2]
    
    for i in arr:
        if i == 2:
            cnt += 1
        if cnt >= 1:
            if check == cnt:
                answer.append(i)
                return answer
            answer.append(i)
        