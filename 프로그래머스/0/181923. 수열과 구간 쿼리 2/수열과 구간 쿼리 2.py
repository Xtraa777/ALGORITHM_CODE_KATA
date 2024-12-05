def solution(arr, queries):
    answer = []
    
    for s, e, k in queries:
        tmp = []
        for i in arr[s:e+1]:
            if i > k:
                tmp.append(i)
        answer.append(-1 if not tmp else min(tmp))
    
    return answer