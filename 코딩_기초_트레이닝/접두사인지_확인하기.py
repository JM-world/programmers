def solution(my_string, is_prefix):
    a = []
    for i in range(len(my_string)):
        a.append(my_string[:i+1])
    for i in a:
        if i == is_prefix:
            return 1
    return 0