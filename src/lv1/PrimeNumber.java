package lv1;

public class PrimeNumber {
	   public int solution(int n) {
	        int answer = 0;
	        boolean[] check = new boolean[n+1]; //n까지의 수를 boolean배열에 담는다.(index값이 곧 해당 수)
	        //i가 1씩 커질때마다 i의 배수를 지워나가는 식으로 n이 커질때 연산 횟수를 크게 줄여나갈 수 있다. 
	        
	        for(int i=2; i<=n; i++) {
	           if(check[i]==false) { //boolean 초기값은 false
	              answer++;
	           }
	           for(int k=i*2; k<=n; k+=i) {  //i의 배수를 n까지 지워나가면 남은것은 소수
	              check[k]=true;  //check배열 원소가 true이면 연산이 실행되지 않는다.
	           }
	        }
	        return answer;
	    }
	   public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      PrimeNumber pn = new PrimeNumber();
	      System.out.println(pn.solution(1000000));
	   }

	}