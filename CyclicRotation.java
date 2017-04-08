/**
 * Created by zhaolianzhou on 5/04/17.
 */
public class CyclicRotation {
    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int n = A.length;
        if(n==0) {
            return A;
        }
        if(n<=K){
            K=K%n;
        }
        int[] tem = new int[K];
        for(int i = 0;i < K; i++ ){
            tem[i]=A[n-K+i];
        }
        for(int i=n-K-1; i >-1;i--){
            A[i+K] = A[i];
        }
        for(int i = 0; i < K; i++){
            A[i]=tem[i];
        }
        return A;
    }
    public static void main(String[] args) {
        int[] A= {3, 8, 9, 7, 6};
        int[] result = solution(A,3);
        for (int i : result) {
            System.out.print(i);
        }

    }
}
