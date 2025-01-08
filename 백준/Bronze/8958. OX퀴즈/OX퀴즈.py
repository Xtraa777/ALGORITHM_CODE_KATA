t = int(input())

quiz = [input() for _ in range(t)]
for i in quiz:
    score = 0
    count = 0
    
    for j in i:
        if j == 'O':
            count += 1
            score += count
        else:
            count = 0
            
    print(score)