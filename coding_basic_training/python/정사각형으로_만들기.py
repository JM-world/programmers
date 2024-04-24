def solution(arr):
    n = len(arr)-len(arr[0])
    if len(arr) > len(arr[0]):
        for i in arr:
            for _ in range(n):
                i.append(0)
                print(len(arr[0]))
        return arr
    elif len(arr) < len(arr[0]):
        for _ in range(len(arr[0])-len(arr)):
            arr.append([0]*len(arr[0]))
        return arr
    else:
        return arr