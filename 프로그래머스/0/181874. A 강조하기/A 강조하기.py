def solution(myString):
    myList = list(myString)
    
    for idx, i in enumerate(myList):
        if i == 'a':
            myList[idx] = 'A'            
        elif i != 'A':
            myList[idx] = i.lower()
        
    return ''.join(myList)