n, m = map(int, input().split())
bowl = [i for i in range(n + 1)]

for _ in range(m):
    i, j = map(int, input().split())
    bowl[i], bowl[j] = bowl[j], bowl[i]

print(*bowl[1:])