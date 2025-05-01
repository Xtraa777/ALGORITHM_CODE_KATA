from collections import Counter

def solution(s):
    sc = Counter(s.lower())

    return sc['p'] == sc['y']