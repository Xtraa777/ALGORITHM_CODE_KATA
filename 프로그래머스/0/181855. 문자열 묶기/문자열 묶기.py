def solution(strArr):
    strDict = {}
    
    for i in strArr:
        strDict[len(i)] = strDict.get(len(i), 0) + 1
    
    return max(strDict.values())