def solution(my_string):
    a= []
    for i in range(len(my_string)):
        a.append(my_string[i:])
        a.sort()
    return a