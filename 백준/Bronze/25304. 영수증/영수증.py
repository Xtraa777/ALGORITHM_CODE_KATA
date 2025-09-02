import sys
input = lambda: sys.stdin.readline().rstrip()

X = int(input())
N = int(input())
total = 0

for _ in range(N):
     a, b = map(int, input().split())
     total += a * b
    
if total == X:
    print("Yes")
else:
    print("No")