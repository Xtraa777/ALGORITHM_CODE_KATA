from collections import Counter

def solution(array):
    c = Counter(array).most_common(2)
    
    if len(c) == 1:
        return c[0][0]
    elif c[0][1] == c[1][1]:
        return -1
    else:
        return c[0][0]