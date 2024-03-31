public class 코드_처리하기 {
    public String solution(String code) {
		String ret = "";

		int mode = 0;

		for (int i = 0; i < code.length(); i++) {

			if (mode == 0 && code.charAt(i) != '1' && i % 2 == 0) {
				ret += code.charAt(i);
				//System.out.println(i + " : " + ret);
			} else if (mode == 0 && code.charAt(i) == '1')
				mode = 1;

			
			else if (mode == 1 && code.charAt(i) != '1' && i % 2 == 1) {
				ret += code.charAt(i);
				//System.out.println(i + " : " + ret);
			} else if (mode == 1 && code.charAt(i) == '1')
				mode = 0;

			
			//System.out.println(i + " : " + mode);
		}

		if (ret.equals(""))
			return "EMPTY";

		return ret;
	}
}
