def solution(myString, pat):
    pat = list(pat)
    
    for idx, i in enumerate(pat):
        if i == 'A':
            pat[idx] = 'B'
        else:
            pat[idx] = 'A'
        
    pat = ''.join(pat)
        
    return 1 if pat in myString else 0