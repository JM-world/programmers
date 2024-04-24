strArr = ["and","notad","notad","abcd"]
a = []
for i in strArr:
    if 'ad' not in i:
        a.append(i)
print(a)