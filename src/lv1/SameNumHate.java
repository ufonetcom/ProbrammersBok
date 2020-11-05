package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SameNumHate {
    public int[] solution(int []arr) {
           int[] answer = {};
//           배열로만 사용한 방식
//           int count = 0;
//           int tmp = -1;
//           for(int i=0; i<arr.length; i++) {
//              if(tmp!=arr[i]) 
//                 count++;
//              tmp = arr[i];
//           }
//           tmp=-1;
//           
//           answer = new int[count];
//           
//           count=0;
//           for(int i=0; i<arr.length; i++) {
//              if(tmp!=arr[i]) {
//                 answer[count++] = arr[i];
//              }
//              tmp = arr[i];
//           }
           List<Integer> tempList = new ArrayList<>();
           int tmp = -1;
           for(int i=0; i<arr.length; i++) {
              if(tmp!=arr[i]) {
                 tempList.add(arr[i]);
              }
              tmp=arr[i];
           }
           answer = new int[tempList.size()];
           for(int i=0; i<tempList.size(); i++) {
              answer[i] = tempList.get(i);
           }

           return answer;
       }
   
   public static void main(String[] args) {
      SameNumHate snh = new SameNumHate();
//      int[] arr = {1,1,3,3,0,1,1};
      int[] arr = {4,4,4,3,3};
      System.out.println(Arrays.toString(snh.solution(arr)));
   }

}
