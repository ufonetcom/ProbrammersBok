package lv1;

public class YakNumber {
	   public int solution(int n) {
	           int answer = 0;
	           for(int i=1; i<=n/2; i++) {
	              if(n%i==0) {
	                 answer += i;
	              }
	           }
	           return answer+n;
	       }
	   
	   public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      YakNumber yn = new YakNumber();
	      System.out.println(yn.solution(12));
	   }

	}