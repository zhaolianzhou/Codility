import sys
def solution(n):
    d = [0] * 30
    l,last_ok=0,-1
    while (n > 0):
        d[l] = n % 2
        n //= 2
        l += 1
    last_ok = -1
    for p in range(1,(1 + l+1)/2):
        ok = True
        for i in range(l-p):
            if d[i] != d[i + p]:
                ok = False
                break
        if ok:
            last_ok = p

    return last_ok

n =955

print(solution(n))