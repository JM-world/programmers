def solution(arr):
    i = 1
    while True:
        if len(arr) == 1:
            return arr
        elif len(arr) > 2 ** i:
            i += 1
        elif len(arr) < 2 ** i:
            for k in range(2 ** i - len(arr)):
                arr.append(0)
            return arr
        else:
            return arr