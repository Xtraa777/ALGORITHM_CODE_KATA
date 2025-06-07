def solution(emergency):
    answer = []
    
    desc = sorted(emergency, reverse = True)
    descDict = {key: value + 1 for value, key in enumerate(desc)}

    answer = [descDict[i] for i in emergency]
    return answer