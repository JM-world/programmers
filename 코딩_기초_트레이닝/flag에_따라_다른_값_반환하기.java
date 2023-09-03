package 코딩_기초_트레이닝;
class flag에_따라_다른_값_반환하기{}
class Solution {
    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}