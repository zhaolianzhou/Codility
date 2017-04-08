/**
 * Created by zhaolianzhou on 6/04/17.
 */
public class PermMissingElem {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        int expectsum=0;
        int realsum=0;
        for (int i=0;i<n;i++){
            expectsum+=i+1;
            realsum+=A[i];
        }
        return expectsum-realsum+n+1;
    }
}
