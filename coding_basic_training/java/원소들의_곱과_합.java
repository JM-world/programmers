
public class 원소들의_곱과_합 {
    
}
class Solution {
    public int solution(int[] list) {
        int answer = 0;
        int n = 1;
        int m = 0;
        
        for (int i = 0; i < list.length; i++) {
			n *= list[i];
			m += list[i];
		}
        System.out.println(n);
        System.out.println(m);
        m = m * m;
        
        if ( n < m ) answer = 1;
        else if ( n > m ) answer = 0;
        
        return answer;
    }
}