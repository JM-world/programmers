def solution(my_string, indices):
    a = list(my_string)
    for i in indices:
        a[i] = ''
    b = ''.join(a)
    return b
    
