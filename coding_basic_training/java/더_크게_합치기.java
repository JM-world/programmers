<<<<<<<< HEAD:coding_basic_training/더_크게_합치기.java
package 코딩_기초_트레이닝;
========
>>>>>>>> d903be9 (programmers):coding_basic_training/java/더_크게_합치기.java

public class 더_크게_합치기 {
    
}
class Solution {
	public int solution(int a, int b) {
		int answer = 0;
		String c = Integer.toString(a) + Integer.toString(b);
		String d = Integer.toString(b) + Integer.toString(a);
		a = Integer.parseInt(c);
		b = Integer.parseInt(d);

		if (a > b) {
			answer = a;
		} else {
			answer = b;
		}

		return answer;
	}

}