N = int(input())
igd = list(map(str, input().split()))
used_igd = set(map(str, input().split()))
    
for i in igd:
    if i not in used_igd:
        print(i)