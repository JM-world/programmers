<<<<<<<< HEAD:coding_basic_training/공배수.java
package 코딩_기초_트레이닝;
========
>>>>>>>> d903be9 (programmers):coding_basic_training/java/공배수.java

public class 공배수 {
    
}
class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if ( number % n == 0 && number % m == 0) {
        	answer = 1;
        } else {
        	answer = 0;
        }
        return answer;
    }
}
