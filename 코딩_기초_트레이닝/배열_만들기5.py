def solution(intStrs, k, s, l):
    a = []
    for i in intStrs:
        if k < int(i[s:s+l]):
            a.append(int(i[s:s+l]))
    return a