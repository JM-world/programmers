def solution(num_list, n):
    n = num_list[n:]
    n += (num_list[:n])
    return n