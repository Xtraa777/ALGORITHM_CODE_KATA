def solution(rsp):
    rspDict = {"2":"0", "0":"5", "5":"2"}
    
    return ''.join([rspDict.get(i) for i in rsp])