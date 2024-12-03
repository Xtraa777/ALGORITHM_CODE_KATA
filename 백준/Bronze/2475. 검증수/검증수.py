num = list(map(int, input().split()))

result = sum(i ** 2 for i in num) % 10

print(result)