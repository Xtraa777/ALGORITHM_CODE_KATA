def solution(picture, k):
    answer = []
    
    for i in picture:
        newPicture = ''.join([x * k for x in i])
        for _ in range(k):
            answer.append(newPicture)
            
    return answer