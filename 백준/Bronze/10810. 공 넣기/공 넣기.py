n, m = map(int, input().split())
bowl = [0] * (n + 1)

for _ in range(m):
    i, j, k = map(int, input().split())
    for x in range(i, j + 1):
        bowl[x] = k

result = " ".join(map(str, bowl[1:]))
print(result)