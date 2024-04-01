public class 배열_만들기2 {
    public int[] solution(int l, int r) {
        int[] answer = new int[r];
        String a = "";
        int n = 0;
        int sum = 0;
        
        for (int i = l; i <= r; i++) {
			a = Integer.toString(i);
        	 for (int j = 0; j < a.length(); j++) {
    			 if ( a.charAt(j) == '5' || a.charAt(j) == '0' ) {
    				 if ( j + 1 == a.length() && a.charAt(j) == '5' ||
    						 j + 1 == a.length() && a.charAt(j) == '0' ) {
    					 answer[n] = i;
    					 n++;
    				 }
				continue;
    			 }
				else break;
			}
		}
        
       for (int i = 0; i < answer.length; i++) {
		 if (answer[i] != 0)
			 sum += 1;
		 else if (answer[0] == 0) {
			 sum = 1;
			 break;
		 }
		 
	}
        int[] answer2 = new int[sum];
        for (int i = 0; i < answer2.length; i++) {
			answer2[i] = answer[i];
			if ( answer[0] == 0 ) { 
				answer2[i] = -1;
				break;
			}
			
		}
        
        
        return answer2;
    }
}
