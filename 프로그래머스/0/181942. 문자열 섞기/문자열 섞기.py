def solution(str1, str2):
    answer = ''.join([x + y for x, y in zip(str1, str2)])
    return answer