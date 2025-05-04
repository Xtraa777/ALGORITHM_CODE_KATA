def solution(board, moves):
    stacks = [[] for _ in range(len(board[0]))]
    
    for i in range(len(board) - 1, -1, -1):
        for j in range(len(board[0])):
            if board[i][j]:
                stacks[j].append(board[i][j])
                
    bucket = []
    answer = 0
    for i in moves:
        if stacks[i - 1]:
            doll = stacks[i - 1].pop()
            
            if bucket and bucket[-1] == doll:
                bucket.pop()
                answer += 2
            else:
                bucket.append(doll)
                
    return answer