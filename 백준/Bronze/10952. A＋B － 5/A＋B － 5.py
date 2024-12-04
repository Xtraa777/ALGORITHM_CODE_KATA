while 1:
    try:
        A, B = map(int, input().split())
        if A + B > 0: 
            print(A + B)
    except:
        break