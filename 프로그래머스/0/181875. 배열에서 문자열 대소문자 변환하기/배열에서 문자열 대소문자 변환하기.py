def solution(strArr):
    for idx, i in enumerate(strArr):
        if idx % 2 == 0:
            strArr[idx] = i.lower()
        else:
            strArr[idx] = i.upper()
    
    return strArr