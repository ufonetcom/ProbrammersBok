package lv1;

import java.util.Arrays;

public class Divisible {
   public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int[] temp = new int[arr.length];
        
        int answerSize = 0;
        for(int i=0; i<arr.length; i++) {
           if(arr[i]%divisor==0) 
              temp[answerSize++] = arr[i];
        }
        answer = new int[answerSize];
        
//      System.arraycopy(temp, 0, answer, 0, answer.length); 밑에와 같은 방법:배열의 복사
        answer = Arrays.copyOfRange(temp, 0, answer.length);
        
//      원소중 하나도 나누어 떨어지지 않을때 -1값의 원소를 저장하고 리턴
        if(answer.length==0) {
           answer = new int[1];
           answer[0]=-1;
           return answer;
        }
        Arrays.sort(answer);
        
        return answer;
    }
   
   public static void main(String[] args) {
      Divisible divArray = new Divisible();
      int[] arr= {2, 36, 1, 3};
//      int[] arr= {5,9,7,10};
//      int[] arr= {3,2,6};
      
      int divisor = 1;
//      int divisor = 5;
//      int divisor = 10;
      System.out.println(Arrays.toString(divArray.solution(arr, divisor)));
   }

}
