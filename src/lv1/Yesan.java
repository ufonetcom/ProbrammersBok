package lv1;

import java.util.Arrays;

public class Yesan {
   public int solution(int[] d, int budget) {
        int answer = 0;
        int sum=0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++) {
           sum += d[i];
           if(sum>budget) {
              answer = i;
              break;
           }
        }
        if(sum<=budget) {
           answer = d.length;
        }
        return answer;
    }
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Yesan ye = new Yesan();
//      int[] d = {1,3,2,5,4};
      int[] d = {2,2,3,3};
//      int budget = 9;
      int budget = 10;
      System.out.println(ye.solution(d, budget));
   }

}
