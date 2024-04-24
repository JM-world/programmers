def solution(myString):
    a = []
    m_list = myString.split('x')
    m_list.sort()
    for i in m_list:
        if len(i) >0:
            a.append(i)
    return a