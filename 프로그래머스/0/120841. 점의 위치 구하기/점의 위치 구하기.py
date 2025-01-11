def solution(dot):
    
    dotList = [[2, 1], [3, 4]]
    
    return dotList[dot[1] < 0][dot[0] > 0]