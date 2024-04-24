<<<<<<<< HEAD:coding_basic_training/n_의_배수.java
package 코딩_기초_트레이닝;
========
>>>>>>>> d903be9 (programmers):coding_basic_training/java/n_의_배수.java

public class n_의_배수 {
    
}

class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        if ( num % n == 0 ) {
        	answer = 1;
        } else {
        	answer = 0;
        }
        return answer;
    }
}