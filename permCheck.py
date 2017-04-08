def solution(A):
    # write your code in Python 2.7
    n = len(A)
    new_array=[0]*n
    for item in A:
        if item <= n and item >0:
            new_array[item-1]=item
    for i in range(n):
        if new_array[i]==0:
            return 0

    return 1