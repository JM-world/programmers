def solution(arr, intervals):
    a = []
    for i in range(intervals[0][0],intervals[0][1]+1):
        a.append(arr[i])
    for i in range(intervals[1][0],intervals[1][1]+1):
        a.append(arr[i])

    return a
