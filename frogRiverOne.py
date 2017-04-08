def solution(X, A):
    # write your code in Python 2.7
    pos_left = set()
    for item in A:
        if item <= X and item >0:
            pos_left.add(item)
            if len(pos_left) == X:
                return A.index(item)
    return -1