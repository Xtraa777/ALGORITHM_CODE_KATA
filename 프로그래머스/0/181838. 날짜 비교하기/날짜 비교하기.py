def solution(date1, date2):
    
    date1 = ''.join([str(i) for i in date1])
    date2 = ''.join([str(i) for i in date2])
    
    return int(int(date1) < int(date2))