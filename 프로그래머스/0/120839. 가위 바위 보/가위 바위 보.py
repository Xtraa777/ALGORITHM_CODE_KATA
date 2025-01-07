def solution(rsp):
    answer = ''
    rspDict = {"2":"0", "0":"5", "5":"2"}
    
    for i in rsp:
        answer += rspDict.get(i)
    
    return answer