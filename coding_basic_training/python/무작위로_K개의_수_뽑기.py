def solution(arr, k):
    pop_list = []
    for i in range(len(arr)):
        if arr[i] not in pop_list:
            pop_list.append(arr[i])
    pop_list = pop_list[:k]
    if len(pop_list) < k:
        for _ in range(k - len(pop_list)):
            pop_list.append(-1)
    return pop_list