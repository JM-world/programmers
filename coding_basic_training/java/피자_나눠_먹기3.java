public class 피자_나눠_먹기3 {
    public int solution(int slice, int n) {
        if (n%slice != 0) {
            return n / slice + 1;
        } else {
            return n / slice;
        }
    }
}
