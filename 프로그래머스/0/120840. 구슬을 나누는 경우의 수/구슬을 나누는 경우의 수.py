import math 

def solution(balls, share):

    son = math.factorial(balls)
    mom =  math.factorial(balls - share) * math.factorial(share) 
    
    answer = son / mom
    return answer