package lv1;

import java.util.Arrays;

public class IntervalNumber {
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long plusResult = x;
        
        for(int i=0; i<answer.length; i++) {
        	answer[i] = plusResult*(i+1);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntervalNumber in = new IntervalNumber();
		int x=4;
		int n=3;
		System.out.println(Arrays.toString(in.solution(x, n)));
	}

}
