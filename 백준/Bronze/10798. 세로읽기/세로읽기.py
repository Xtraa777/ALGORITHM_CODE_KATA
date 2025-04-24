list_str = [input() for _ in range(5)]

result = ''
for j in range(15):
    for i in range(5):
        if j < len(list_str[i]):
            result += list_str[i][j]

print(result)