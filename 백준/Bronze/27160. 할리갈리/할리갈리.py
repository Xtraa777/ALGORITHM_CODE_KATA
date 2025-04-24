N = int(input())
cards = {
    'BANANA' : 0,
    'PLUM' : 0,
    'STRAWBERRY' : 0,
    'LIME' : 0
}

for i in range(N):
    fruit, n = input().split()
    cards[fruit] += int(n)
    
if 5 in cards.values():
    print("YES")
else:
    print("NO")