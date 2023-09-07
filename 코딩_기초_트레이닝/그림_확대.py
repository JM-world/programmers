def solution(picture, k):
    base = ','.join(picture).replace('.', '.' * k)
    base = ''.join(base).replace('x', 'x' * k)
    picture = base.split(',')
    a = []
    print(picture)
    for i in range(len(picture)):
        for _ in range(k):
            a.append(picture[i])
    return a