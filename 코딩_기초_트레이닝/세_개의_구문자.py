def solution(myStr):
        b = []
        myStr = myStr.replace('a', ' ')
        myStr = myStr.replace('b', ' ')
        myStr = myStr.replace('c', ' ')
        myStr = myStr.strip()
        a = myStr.split(' ')
        for i in a:
            if len(i) > 0:
                b.append(i)
        if b == []:
            return ['EMPTY']
        else:
            return b