def solution(angle):
    if angle == 90:
        return 2
    elif angle < 90:
        return 1
    elif angle == 180:
        return 4
    return 3