def solution(box, n):

    width = box[0] // n
    height = box[1] // n
    depth = box[2] // n
    
    return width * height * depth