package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sportssuit {
   public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
//        {1,2,3,4,5}
        
//        옷을 빌려줄 사람이 잊어버렸을때 ( ex. 옷이 두개인 사람이 하나를 도둑 맞았을때 ,, 남는건 하나,, 즉 옷을 빌려줄 수 없는 사람이 된다.)
        for(int i=0; i<lost.length; i++) {
           for(int j=0; j<reserve.length; j++) {
              if(lost[i]==reserve[j]) {
                 lost[i]=-1;
                 reserve[j]=-1;
                 answer++;
                 break;
              }
           }
        }
//        2벌의 옷을 가지고 있는 사람이 양쪽 중에 한쪽을 옷을 빌려주고 reserve 배열에서 원소를 지워준다(-1을 만든다.). 
        for(int i=0; i<lost.length; i++) {
           for(int j=0; j<reserve.length; j++) {
              if(lost[i]-reserve[j]==-1 || lost[i]-reserve[j]==1) {
                 reserve[j]=-1;
                 answer++;
                 break;
              }
           }
        }
        
        return answer;
    }
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
	   Sportssuit suit = new Sportssuit();
      int[] lost = {2,4};
//      int[] lost = {1,3,4};
//      int[] lost = {2,3,4};
      
      int[] reserve = {1, 3, 5};
//      int[] reserve = {3};
//      int[] reserve = {2,3};
//      int[] reserve = {1,3,5,9};
      System.out.println(suit.solution(5, lost, reserve));
   }

}
