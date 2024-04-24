def solution(rank, attendance):
    a = []
    for i in range(1, len(rank)+1):
        check = rank.index(i)
        if attendance[check]:
            a.append(rank.index(i))
    return 10000 * a[0] + 100 * a[1] + a[2]