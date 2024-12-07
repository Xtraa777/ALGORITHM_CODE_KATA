def tri(li):
    if li[2]**2 == li[0]**2 + li[1]**2:
        return True
    else:
        return False

while True:
    a, b, c = map(int, input().split())
    if a == b == c == 0:
        break
    if tri(sorted([a, b, c])):
        print("right")
    else:
        print("wrong")