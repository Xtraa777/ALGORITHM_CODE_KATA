def solution(my_string, indices):
    
    return ''.join([i for idx, i in enumerate(my_string) if idx not in indices])