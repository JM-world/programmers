picture = [".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."]
k = 3

base = ','.join(picture).replace('.', '.' * k)
base = ''.join(base).replace('x', 'x' * k)
picture = base.split(',')
for i in range(0, len(picture)*k, k):
    picture.insert(i, picture[i])
print(picture)
