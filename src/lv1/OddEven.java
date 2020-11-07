package lv1;

public class OddEven {

	public String solution(int num) {
		String answer = "";
		if (num % 2 == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddEven oe = new OddEven();
		System.out.println(oe.solution(3));
	}

}
