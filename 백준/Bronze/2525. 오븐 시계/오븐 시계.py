h, m = map(int, input().split())
ctime = int(input())

time = (h * 60) + m + ctime

h = time // 60
m = time % 60

if h >= 24:
    h = h % 24

print(h, m)