def solution(myString):
    myString = list(myString
                   )
    for idx, i in enumerate(myString):
        if ord(i) < ord('l'):
            myString[idx] = 'l'
    
    return ''.join(myString)