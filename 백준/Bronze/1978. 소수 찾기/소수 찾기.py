import math

def is_prime(num):
    if num < 2:
        return False
    
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False

    return True

n = int(input()) 
numbers = list(map(int, input().split())) 

cnt = 0
for num in numbers:
    if is_prime(num):
        cnt += 1

print(cnt)