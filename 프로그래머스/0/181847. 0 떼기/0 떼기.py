def solution(n_str):
    index = 0
    
    for idx, i in enumerate(n_str):
        if i != '0':
            index = idx
            break
    
    return n_str[index:]