import java.util.Scanner;
public class 대소문자_바꿔서_출력하기 {
    
		
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        String a = sc.next();
	        String alpa = "";
	        
	        for (int i = 0; i < a.length() ; i++) {
	        	char c = a.charAt(i);
	            if ( Character.isUpperCase(c)) {
	                alpa += Character.toLowerCase(c);
	            } else alpa += Character.toUpperCase(c);
	                
	        }
	        System.out.println(alpa);
	        sc.close();
	    }
	}
