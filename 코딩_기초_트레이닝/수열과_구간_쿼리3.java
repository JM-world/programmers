// package 코딩_기초_트레이닝;

// public class 수열과_구간_쿼리3 {
    
// }
// class Solution {
//     public int[] solution(int[] arr, int[][] queries) {
//         int[] answer = arr;
//         int temp = 0;
//         for (int i = 0; i < queries.length; i++) {   // {3,2,1,0,4}  i = 2
//         	temp = arr[queries[i][0]]; // temp = 1
//         	arr[queries[i][0]] = arr[queries[i][1]];  // arr[1] = arr[4]
//         	arr[queries[i][1]] = temp;
//         }
//         for (int i = 0; i < answer.length; i++) {
			
//         	System.out.print(arr[i]);
// 		}
        
//         return answer;
//     }
    
//     public static void main(String[] args) {
		
//     	Solution s = new Solution();
    	
//     	int[] t = {0,1,2,3,4};
//     	int[][] y = {{0,3},{1,2},{1,4}};
//     	s.solution(t,y);
    	
// 	}
// }