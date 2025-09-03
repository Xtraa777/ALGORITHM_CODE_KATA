from collections import Counter

def solution(array):
    cnt = Counter(array).most_common(2)
    
    if len(cnt) == 1:
        return cnt[0][0]
    elif cnt[0][1] == cnt[1][1]: 
        return -1
    else:
        return cnt[0][0]