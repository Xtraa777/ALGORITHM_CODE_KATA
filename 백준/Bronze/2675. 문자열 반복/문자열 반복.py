T = int(input())

for i in range(T):
    R, S = input().split()
    R = int(R)
    s = ''
    for i in S:
        s += (i * R)
    print(s)