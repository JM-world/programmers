<<<<<<<< HEAD:coding_basic_training/마지막_두_원소.java
package 코딩_기초_트레이닝;
========
>>>>>>>> d903be9 (programmers):coding_basic_training/java/마지막_두_원소.java

public class 마지막_두_원소 {
    
}
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        
        for (int i = 0; i < num_list.length; i++) {
        	answer[i] = num_list[i];
        }
			
//        for (int i = 0; i < answer.length; i++) {
//        	System.out.println(answer[i]);
//			
//		}
        
        if ( num_list[num_list.length-1] > num_list[num_list.length-2] ) {
        	answer[answer.length-1] = num_list[num_list.length-1] - num_list[num_list.length-2];
        }
        else 
        	answer[answer.length-1] = num_list[num_list.length-1] * 2;
          return answer;
    }
}