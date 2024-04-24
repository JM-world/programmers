<<<<<<<< HEAD:coding_basic_training/수_조작하기1.java
package 코딩_기초_트레이닝;
========
>>>>>>>> d903be9 (programmers):coding_basic_training/java/수_조작하기1.java

public class 수_조작하기1 {
    
}
class Solution {
	public int solution(int n, String control) {
		int answer = 0;

		int w = 1;
		int s = -1;
		int d = 10;
		int a = -10;

		for (int i = 0; i < control.length(); i++) {

			if (control.charAt(i) == 'w')
				answer += w;
			else if (control.charAt(i) == 's')
				answer += s;
			else if (control.charAt(i) == 'd')
				answer += d;
			else
				answer += a;

		}

		return n+answer;
	}
}