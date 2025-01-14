import sys

k, n = map(int, sys.stdin.readline().split())
lans = []

for _ in range(k):
    lans.append(int(sys.stdin.readline()))

left, right = 1, max(lans)
answer = 0

while left <= right:
    mid = (left + right) // 2
    count = sum(lan // mid for lan in lans)

    if count >= n:
        answer = mid
        left = mid + 1
    else:
        right = mid - 1
        
print(answer)