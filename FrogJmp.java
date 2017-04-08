/**
 * Created by zhaolianzhou on 6/04/17.
 */
import java.lang.*;
public class FrogJmp {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int dis = Y-X;
        int steps = 0;
        if(dis%D==0){
            steps = dis/D;
        }else{
            steps = dis/D+1;
        }
        return steps;
    }
}
