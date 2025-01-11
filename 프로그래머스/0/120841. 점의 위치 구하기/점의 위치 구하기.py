def solution(dot):
    
    dotList = [[1, 4], [2, 3]]
    
    return dotList[dot[0] < 0][dot[1] < 0]