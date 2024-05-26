import java.util.Arrays;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        // return할 배열을 생성한다. 길이는 commands의 길이 만큼
        int[] answer = new int[commands.length];
        
        // for문을 선언
        for(int f = 0; f < commands.length; f++) {
            // 문제와 같이 i, j, k를 선언한다.
            int i = commands[f][0];
            int j = commands[f][1];
            int k = commands[f][2];
            
            // copyOfRange를 사용하여 i-1에서 j전까지 자른 배열을 반환
            int[] arr = Arrays.copyOfRange(array, i - 1, j);
            // 정렬
            Arrays.sort(arr);
            
            // answer 배열에 순서대로 들어갈 수 있게 arr의 k-1번째의 수를 담아준다.
            answer[f] = arr[k - 1];
            
        }
        return answer;
    }
}
