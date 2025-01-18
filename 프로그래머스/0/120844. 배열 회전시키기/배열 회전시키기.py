def solution(numbers, direction):
    answer = []
    if direction == "right":
        answer += numbers[:-1]
        answer.insert(0,numbers[-1])
    if direction == "left": 
        answer += numbers[1:]
        answer.insert(len(numbers),numbers[0])    
    return answer