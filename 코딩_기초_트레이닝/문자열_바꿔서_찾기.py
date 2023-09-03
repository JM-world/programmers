def solution(myString, pat):
    b = ''
    for i in range(len(myString)):
        if myString[i] == 'A':
             b += 'B'
        else:
             b += 'A'
    if pat in b:
        return 1
    return 0