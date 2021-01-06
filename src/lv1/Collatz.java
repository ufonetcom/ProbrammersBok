package lv1;

public class Collatz {
	public int solution(int num) {
        int answer = 0;
        
        while(num!=1) {
        	if(num%2==0) {
        		num = num / 2;
        	}
        	else if(num%2==1){
        		num = (num*3) + 1;
        	}
        	answer++;
        	
        	System.out.println(answer + "  " + num); 
        	
        	if(answer==500) {
        		return -1;
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collatz col = new Collatz();
		System.out.println(col.solution(626331));

	}

}
