def solution(myString):
    s_list = myString.split('x')
    a = []
    for i in s_list:
        a.append(len(i))
    return a