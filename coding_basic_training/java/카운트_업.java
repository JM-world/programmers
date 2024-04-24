<<<<<<<< HEAD:coding_basic_training/카운트_업.java
package 코딩_기초_트레이닝;
========
>>>>>>>> d903be9 (programmers):coding_basic_training/java/카운트_업.java
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