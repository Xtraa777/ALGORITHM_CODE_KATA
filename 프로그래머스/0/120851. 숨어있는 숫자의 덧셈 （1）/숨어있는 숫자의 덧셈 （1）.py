def solution(my_string):
    a = 0
    for i in my_string:
        if i.isdigit() == True:
            a+= int(i)
    return a