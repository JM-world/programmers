def solution(numbers, n):
    a = 0
    for i in range(len(numbers)):
        if a <= n:
            a += numbers[i]
    return a