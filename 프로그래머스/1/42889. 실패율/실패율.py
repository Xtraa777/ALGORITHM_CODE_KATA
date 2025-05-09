from collections import Counter

def solution(N, stages):
    answer = []
    
    players = Counter(stages)
    total_p = len(stages)
    
    fails = {}
    for i in range(1, N + 1):
        if players[i] == 0:
            fails[i] = 0
        else:
            fails[i] = players[i] / total_p
            total_p -= players[i]

    return sorted(fails, key=lambda x : fails[x], reverse=True)