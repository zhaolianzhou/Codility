def solution(N):
    binN = str(bin(N))[2:]
    n = len(binN)
    # print(binN)
    binAr=binN.split('1')

    max_len = None
    if binN[n-1]=='0':
        binAr = binAr[:-1]
    # print(binAr)
    for item in binAr:
        if max_len is None or max_len < len(item):
            max_len = len(item)
    return max_len

print(solution(51712))