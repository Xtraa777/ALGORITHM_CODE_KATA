def solution(order):
    count = 0
    
    for coffee in order:
        if 'latte' in coffee:
            count += 5000
        else:
            count += 4500
    
    return count