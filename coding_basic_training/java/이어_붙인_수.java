
public class 이어_붙인_수 {
    
}
class Solution {
	public int solution(int[] num_list) {
		int answer = 0;
		String str1 = "";
		String str2 = "";

		for (int i = 0; i < num_list.length; i++) {
			int n = 0;
			if (num_list[i] % 2 == 0) {
				n = num_list[i];
				str1 += Integer.toString(n);
			} else {
				n = num_list[i];
				str2 += Integer.toString(n);
			}
		}
		
		answer = Integer.parseInt(str1) + Integer.parseInt(str2);

		return answer;
	}
}