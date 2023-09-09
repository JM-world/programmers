def solution(num_list, n):
    num = num_list[n:]
    num += (num_list[:n])
    return num