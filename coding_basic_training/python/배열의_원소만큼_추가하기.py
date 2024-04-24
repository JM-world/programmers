def solution(arr):
    a = []
    for i in range(len(arr)):
        for j in range(arr[i]):
            a.append(arr[i])
    return a