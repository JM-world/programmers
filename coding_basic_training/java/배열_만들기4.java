import java.util.ArrayList;
import java.util.List;

public class 배열_만들기4 {
    public int[] solution(int[] arr) {

		List<Integer> answer = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i += 0) {
			if ( answer.isEmpty() ) {
				answer.add(arr[i]);
				i++;
			}
			if ( answer.get(answer.size()-1) < arr[i] ) {
				answer.add(arr[i]);
				i++;
			}
				else answer.remove(answer.size()-1);
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}
