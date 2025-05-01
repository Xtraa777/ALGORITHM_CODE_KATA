import sys
input = sys.stdin.readline

n = int(input())
stack = []
top = -1

for _ in range(n):
    temp = input().split()
    if temp[0] == 'push':
        stack.append(int(temp[1]))
        top += 1
    elif temp[0] == 'pop':
        if stack:
            print(stack.pop())
            top -= 1
        else:
            print(-1)
    elif temp[0] == 'size':
        print(len(stack))
    elif temp[0] == 'empty':
        if stack:
            print(0)
        else:
            print(1)
    elif temp[0] == 'top':
        if top != -1:
            print(stack[top])
        else:
            print(-1)