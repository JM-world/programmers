def solution(my_strings, parts):
    s = ''
    for i in range(len(my_strings)):
        a = my_strings[i]
        a = a[parts[i][0]:parts[i][1]+1]
        s += a
    return s