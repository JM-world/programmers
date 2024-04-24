def solution(str_list):
    for i in range(len(str_list)):
        if str_list[i] == 'l':
            return str_list[:i]
            break
        if str_list[i] == 'r':
            return str_list[i+1:]
            break
        if 'l' not in str_list and 'r' not in str_list:
            return []