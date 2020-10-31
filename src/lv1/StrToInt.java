package lv1;

//문자열을 정수로 바꾸기!!~~~~
public class StrToInt {
	public int getStrToInt(String s) {
		int answer = 0;
		if (s.length() >= 1 && s.length() <= 5 && s.charAt(0) != '0') {
			answer = Integer.parseInt(s);
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrToInt strToInt = new StrToInt();
		System.out.println(strToInt.getStrToInt("-6234"));

	}

}