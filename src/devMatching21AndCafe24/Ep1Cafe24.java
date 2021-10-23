package devMatching21AndCafe24;

import java.util.Arrays;
import java.util.Scanner;

public class Ep1Cafe24 {
	
	public String[] solution(int startNumber, int endNumber) {
		int abs = Math.abs(startNumber-endNumber);
		String[] answer = new String[abs+1];
		int startTmp = startNumber;
		
		
		for(int i=0; i<answer.length; i++) {
			String tmp = "";
			
			for(int j=0; j<9-i; j++) {
				tmp += "0";
			}
		
			if(startNumber<endNumber) {
				for(int k=startTmp; k<startNumber+1; k++) {
					tmp += Integer.toString(k);
				}
				startNumber++;
			}else if(startNumber>endNumber){
				for(int k=startTmp; k>startNumber-1; k--) {
					tmp += Integer.toString(k);
				}
				startNumber--;
			}else {
				if(startTmp<endNumber) {
					for(int k=startTmp; k<startNumber+1; k++) {
						tmp += Integer.toString(k);
					}
				}else {
					for(int k=startTmp; k>startNumber-1; k--) {
						tmp += Integer.toString(k);
					}
				}
			}
			
			System.out.println(tmp);
			answer[i] = tmp;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ep1Cafe24 ep2 = new Ep1Cafe24();
		Scanner scanner = new Scanner(System.in);
		
		
		//입력값
		int startNum = scanner.nextInt();
		int endNum = scanner.nextInt();
		
		//테스트 출력
		System.out.println(Arrays.toString(ep2.solution(startNum, endNum)));

	}

}
