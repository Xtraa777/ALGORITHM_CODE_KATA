from collections import Counter

N = int(input())
c = Counter(map(int, input().split()))
v = int(input())

print(c[v])