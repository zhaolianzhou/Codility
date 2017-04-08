/**
 * Created by zhaolianzhou on 6/04/17.
 */
public class TapeEquilibrium {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        int[] sum = new int[n];
        sum[0]=A[0];
        for (int i = 1; i < n; i++){
            sum[i]=sum[i-1]+A[i];
        }
        int min_diff = Integer.MAX_VALUE;
        for (int i = 0; i < n-1; i++){
            int part1 = sum[i];
            int part2 = sum[n-1]-sum[i];
            int curr_diff = Math.abs(part1-part2);
            if (curr_diff<min_diff){
                min_diff=curr_diff;
            }
        }
        return min_diff;
    }
}
