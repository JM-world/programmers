public class 짝수는_싫어요 {
    public int[] solution(int n) {
        int[] array = new int[(n+1)>>1];
        for (int i=1, j=0; i<=n; i+=2, j++) {
            array[j] = i;
        }
        return array;
    }
}
