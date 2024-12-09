import math

def solution(numer1, denom1, numer2, denom2):
    denom = denom1 * denom2
    numer = (numer1 * denom2) + (numer2 * denom1)
    
    num = math.gcd(denom, numer)
    answer = [numer//num, denom//num]
    
    return answer