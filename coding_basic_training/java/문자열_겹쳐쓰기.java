public class 문자열_겹쳐쓰기 {
        public String solution(String my_string, String overwrite_string, int s) {
            String answer = "";
    
            answer = my_string.substring(0,s);
            answer += overwrite_string;
            answer += my_string.substring(s + overwrite_string.length(), my_string.length());
            
            return answer;
        }
        
       
}
