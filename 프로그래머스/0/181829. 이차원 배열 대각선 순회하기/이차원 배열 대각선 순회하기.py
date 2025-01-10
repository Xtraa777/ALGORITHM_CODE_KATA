def solution(board, k):
    check = []
    
    for i in range(len(board)):
        for j in range(len(board[0])):
            if i + j <= k:
                check.append(board[i][j])
            else:
                break;
    
    return sum(check)