def solution(strArr):
    sum = []
    for k in range(1, 31):
        count = 0
        for i in strArr:
            if len(i) == k:
                count += 1
        if count != 0:
            sum.append(count)
    return max(sum)