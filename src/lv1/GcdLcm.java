package lv1;

import java.util.Arrays;

public class GcdLcm {
   public int[] solution(int n, int m) {
        //유클리드 호제법 이용. 두 수중 큰수를 작은수로 나눈 나머지를 r이라 하면 앞선 작은수와 
        //다시 나누기 연산을 수행한다. 재귀적으로 호출하여 작은값이 0이 나오면 그 스택에 큰값이 
        //최대공약수가 된다.
        //최소공배수는 두 수를 곱하여 최대공약수로 나눈 수가 최소공배수가 된다.
	   	int[] answer = new int[2];
        int gcd = gcd(m,n); //재귀적 호출을 이용하여 최대공약수 구하는 메서드.
        
        answer[0]=gcd;
        answer[1]=(n*m)/gcd;
        return answer;
    }
   private int gcd(int m, int n) {
      //n이 0이면 큰 수 m이 최대공약수가 된다.
      if(n==0) {
         return m;
      }
      //n이 0이 될때까지 재귀적 호출로 m%n을 수행하여 (작은수,두수를나눈나머지)형태로 진행된다.
      return gcd(n,m%n);
   }
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      GcdLcm gl = new GcdLcm();
      System.out.println(Arrays.toString(gl.solution(3, 12)));
   }

}
