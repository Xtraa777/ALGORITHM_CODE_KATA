def solution(angle) :
    if angle <= 90 :
        return 2 if angle == 90 else 1        
    elif 90 < angle:
        return 4 if angle == 180 else 3