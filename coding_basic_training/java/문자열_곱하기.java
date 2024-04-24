<<<<<<<< HEAD:coding_basic_training/문자열_곱하기.java
package 코딩_기초_트레이닝;
========
>>>>>>>> d903be9 (programmers):coding_basic_training/java/문자열_곱하기.java

public class 문자열_곱하기 {
    
}
class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for ( int i = 0 ; i < k ; i++ ) {
            answer += my_string;
        }
        return answer;
    }
}
