def solution(myString, pat):
    count = 0
    result = [myString[i:i+len(pat)] for i in range(0, len(myString), 1)]
    print(result)
    for i in result:
        if i == pat:
            count += 1
    return count
        