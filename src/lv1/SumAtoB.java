package lv1;

//두 정수 사이의 합
public class SumAtoB {
	public long towintsum(int a, int b) {
        long answer = 0;
        
        if(a>b) {
        	//answer=(b-a)-1;
        	for(int i=b; i<a+1; i++) {
        		answer += i;
        	}
        }else {
        	for(int i=a; i<b+1; i++) {
        		answer += i;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumAtoB twointsum = new SumAtoB();
		System.out.println(twointsum.towintsum(3, 7));

	}

}
