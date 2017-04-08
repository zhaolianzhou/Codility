
def solution(A):
    n = len(A)
    max_size = 1
    index_size = dict()
    current_index = 0
    current_size = 1
    for i in range(n):
        if i==n-1:
            index_size[current_index] = current_size
            break
        if A[i]>=A[i+1]:
            index_size[current_index] = current_size
            current_index=i+1
            current_size=1
        else:
            current_size+=1
            if max_size < current_size:
                max_size = current_size

    print("MAx")
    print(max_size)
    print(index_size)
    for item in index_size:
        print(item)
        if index_size[item]==max_size:
            print("result")
            return item

A=[2,2,2,2,1,2,-3,2,1,3]
print(solution(A))