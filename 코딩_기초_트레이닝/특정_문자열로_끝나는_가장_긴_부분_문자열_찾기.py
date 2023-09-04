def solution(myString, pat):
    myString_reverse = myString[::-1]
    pat_reverse = pat[::-1]

    for i in range(len(myString)):
        if i == myString_reverse.find(pat_reverse):
            return myString[:len(myString)-i]