// package 코딩_기초_트레이닝;

// public class 콜라츠_수열_만들기 {
    
// }
// import java.util.ArrayList;
// import java.util.List;

// class Solution {
// 	public int[] solution(int n) {

// 		List<Integer> answer = new ArrayList<Integer>();
// 		answer.add(n);

// 		while (n != 1) {
// 			n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
// 			answer.add(n);
// 		}
// 		return answer.stream().mapToInt(Integer::intValue).toArray();
// 	}
// }