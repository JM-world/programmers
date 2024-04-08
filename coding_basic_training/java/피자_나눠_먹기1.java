public class 피자_나눠_먹기1 {
    public int solution(int n) {
        if (n > 7 && n%7!=0) {
            return  n /7 + 1;
            
        } else if (n % 7 == 0) {
            return n / 7;
        } else {
            return  1;
        }
    }
}
