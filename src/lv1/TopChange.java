package lv1;

import java.util.Arrays;

public class TopChange {
	public int[] solution(long n) {
        int[] answer = {};
        long copy = n;
        
        
//        배열 answer의 크기를 정해주는 함수
        int k=0;
        while(n!=0) {  //n>0 도 가능.
        	k++;
        	n=n/10;
        }
        answer = new int[k];
        
        for(int i=0; i<answer.length; i++) {
        	answer[i]= (int)(copy%10); //매우매우 중요.. long타입의 값을 (int)copy%10 이런식으로 형변환하면 데이터 손실일어남. 
        	copy = copy/10;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopChange tc = new TopChange();
		System.out.println(Arrays.toString(tc.solution(9879879879L)));
	}

}
