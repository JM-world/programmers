def solution(arr):
    a = []
    for i in range(len(arr)):
        for j in range(len(arr[i])):
            if arr[i][j] == arr[j][i]:
                a.append(1)
            else:
                a.append(0)
    if 0 in a:
        return 0
    else:
        return 1
