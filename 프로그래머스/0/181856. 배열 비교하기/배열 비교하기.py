def solution(arr1, arr2):
    
    if len(arr1) != len(arr2):
        return (len(arr1) > len(arr2)) - (len(arr1) < len(arr2))
    else:
        return (sum(arr1) > sum(arr2)) - (sum(arr1) < sum(arr2))