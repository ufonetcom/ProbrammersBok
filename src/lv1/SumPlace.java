package lv1;

public class SumPlace {
	   public int solution(int n) {
	        int answer = 0;
	        while(true) {
	           answer += n%10;
	           if(n==0) {
	              break;
	           }
	           n = n/10;
	        }
	      
	        return answer;
	    }
	   public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      SumPlace sp = new SumPlace();
	      System.out.println(sp.solution(987));
	   }

	}