from collections import Counter

def solution(N, stages):
    player = Counter(stages) # {스테이지번호: 멈춘 플레이어 수}
    total_player = len(stages)
    
    fails = {}
    for i in range(1, N + 1):
        if player[i] == 0:
            fails[i] = 0
        else:
            fails[i] = player[i] / total_player
            total_player -= player[i]
    
    return sorted(fails, key=lambda x : fails[x], reverse=True)