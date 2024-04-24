<<<<<<<< HEAD:coding_basic_training/n개_간격의_원소들.java
package 코딩_기초_트레이닝;
========
>>>>>>>> d903be9 (programmers):coding_basic_training/java/n개_간격의_원소들.java

public class n개_간격의_원소들 {
    
}
class Solution {
	public int[] solution(int[] num_list, int n) {
		int[] answer = num_list;
		int[] arr = new int[num_list.length];
		int a = 0;

		for (int i = 0; i < answer.length; i++) {
			if (i % n == 0) {
				arr[a] += answer[i];
				a++;
			}

		}

		int[] arr2 = new int[a];

		for (int i = 0; i < arr2.length; i++) {

			
			arr2[i] = arr[i];
			if ( i > arr2.length)
				break;
		}

//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}


		return arr2;

	}
}
