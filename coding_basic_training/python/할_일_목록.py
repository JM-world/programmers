def solution(todo_list, finished):
    a = []
    for i in range(len(finished)):
        if finished[i] == False:
            a.append(todo_list[i])
    return a