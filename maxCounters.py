def solution(N, A):
    # write your code in Python 2.7
    counters = [0]*N
    max_value = 0
    last_max = 0
    Asize= len(A)
    for i in range(Asize):
        if A[i] <=N:
            counters[A[i]-1]=max(counters[A[i]-1],last_max)+1
            if max_value < counters[A[i]-1]:
                max_value = counters[A[i]-1]
        elif A[i]==N+1:
            last_max = max_value
    for i in range(N):
        counters[i]=max(counters[i],last_max)
    return counters