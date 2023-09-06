def solution(order):
    cnt_str =''.join(order)
    ame = (cnt_str.count('americano') + \
           cnt_str.count('anything')) * 4500
    la = cnt_str.count('cafelatte') * 5000
    
    return ame + la