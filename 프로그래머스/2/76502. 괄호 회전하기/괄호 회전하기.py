def solution(s):
    s = list(s)
    answer = 0
    
    for _ in range(len(s)):
        stack = []
        for i in range(len(s)):
            if stack:
                if stack[-1] == '[' and s[i] == ']':
                    stack.pop()
                elif stack[-1] == '{' and s[i] == '}':
                    stack.pop()
                elif stack[-1] == '(' and s[i] == ')':
                    stack.pop()
                else:
                    stack.append(s[i]) 
            else:
                stack.append(s[i])    
        if not stack:
            answer += 1
        s.append(s.pop(0))
        
    return answer