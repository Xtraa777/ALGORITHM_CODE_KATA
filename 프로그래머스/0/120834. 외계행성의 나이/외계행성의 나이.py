def solution(age):
    answer = ''.join([chr(97 + int(x)) for x in str(age)])
    return answer