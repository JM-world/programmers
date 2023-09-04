def solution(arr):
    a = 0
    b = 0
    count = 0
    for k in range(len(arr)):
        if arr[k] == 2:
            count += 1
    if count == 1:
        return [2]
    if 2 not in arr:
        return [-1]
    for i in range(len(arr)):
        if arr[i] == 2:
            a = i
            break
    for j in range(-1, -len(arr), -1):
        if arr[j] == 2:
            b = j
            break
    return arr[a:len(arr)-abs(b)+1]