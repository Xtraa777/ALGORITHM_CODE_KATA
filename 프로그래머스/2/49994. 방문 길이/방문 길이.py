def update_coordinate(x, y, dir):
    if dir == 'U':
        nx, ny = x, y + 1
    elif dir == 'D':
        nx, ny = x, y - 1
    elif dir == 'R':
        nx, ny = x + 1, y
    elif dir == 'L':
        nx, ny = x - 1, y
    return nx, ny

def solution(dirs):
    x, y = 0, 0
    answer = set()
    
    for dir in dirs:
        nx, ny = update_coordinate(x, y, dir)
        if -5 <= nx <= 5 and -5 <= ny <= 5:
            answer.add((x, y, nx, ny))
            answer.add((nx, ny, x, y))
            x, y = nx, ny
        
    return len(answer) / 2