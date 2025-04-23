from collections import Counter

def solution(s):
    sc = Counter(s.lower())
    return sc['y'] == sc['p']