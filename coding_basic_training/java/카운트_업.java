import java.util.ArrayList;
import java.util.List;

public class 카운트_업 {
    
}

class Solution {
    public int[] solution(int start_num, int end_num) {

    	List<Integer> answer = new ArrayList<Integer>(); 
    	
    	for (int i = start_num; i <= end_num; i++) {
    		answer.add(i);
			
		}
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}