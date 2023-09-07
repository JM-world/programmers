board = [[0, 1, 2],[1, 2, 3],[2, 3, 4],[3, 4, 5]]
k = 2
a = []
for i in range(len(board)):
    for j in range(len(board[i])):
        if i + j <= k:
            a.append(board[i][j])
print(a)