t = int(input())

for _ in range(t):
    case = list(map(str, input().split()))
    answer = float(case[0])
    for i in range(1, len(case)):
        if case[i] == '@':
            answer *= 3
        elif case[i] == '%':
            answer += 5
        elif case[i] == '#':
            answer -= 7
    
    print(f'{answer:.2f}')
                