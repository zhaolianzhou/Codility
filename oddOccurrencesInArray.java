import java.util.HashSet;

public class oddOccurrencesInArray {
    public int solution(int[] A) {
        // write your code in Java SE 8
    	HashSet<Integer> arr_ele = new HashSet<Integer>();
    	for(int i = 0; i < A.length;i++){
    		if(arr_ele.contains(A[i])){
    			arr_ele.remove(A[i]);
    		}else{
    			arr_ele.add(A[i]);
    		}
    	}
    	Object[] elem = arr_ele.toArray();
    	int result = (int)elem[0];
    	return result;
    }
}
