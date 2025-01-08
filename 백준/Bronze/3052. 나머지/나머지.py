intSet = set()

for _ in range(10):
    num = int(input())
    intSet.add(num % 42)
    
print(len(intSet))