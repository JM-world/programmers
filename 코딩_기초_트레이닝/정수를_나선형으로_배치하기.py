def solution(n):
    result = [[0 for i in range(n)] for i in range(n)]
    count = 1
    s1_num, s2_num = 0, n
    r1_num, r2_num = n - 2 , -1
    while count < n*n +1:
        ### 1번 : 행 고정 / 열 증가 / 첫째줄
        for i in range(s1_num, s2_num):
            result[s1_num][i] = count
            count += 1
        col = i
        s1_num += 1
        ### 2번 : 열 고정 / 행 증가
        for i in range(s1_num, s2_num):
            result[i][col] = count
            count += 1
        row = i
        col -= 1
        s2_num -= 1
        ### 3번 : 행 고정 / 열 감소
        for i in range(r1_num, r2_num,-1):
            result[row][i] = count
            count += 1
        col = i
        r2_num += 1
        ### 4번 : 열 고정 / 행 감소
        for i in range(r1_num, r2_num, -1):
            result[i][col] = count
            count += 1
        row = i
        r1_num -= 1
    return result