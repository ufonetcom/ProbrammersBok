package lv1;

import java.util.Arrays;

public class Maraton {
   public String solution(String[] participant, String[] completion) {
        String answer = "";
        
//      int osum = 0;
//      int sum = 0;
//      for (int i = 0; i < participant.length; i++) {
//         for (int j = 0; j < completion.length; j++) {
//            if (participant[i] == completion[j] && completion[j] != null) {
//               osum += i;
//               completion[j] = null;
//               break;
//            }
//         }
//         sum += i;
//      }
//      answer = participant[sum - osum];
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0; i<completion.length; i++) {
           if(!participant[i].equals(completion[i])) {
              answer = participant[i];
              break;
           }
        }
        if(answer=="")
           answer = participant[participant.length-1];
           
        return answer;
    }
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Maraton mara = new Maraton();
//      String[] a = {"leo", "kiki", "eden"};
      String[] a = {"marina", "josipa", "nikola", "vinko", "filipa"};
//      String[] a = {"mislav", "stanko", "mislav", "ana"};
      
//      String[] b = {"eden", "kiki"};
      String[] b = {"josipa", "filipa", "marina", "nikola"};
//      String[] b = {"stanko", "mislav", "ana"};

      System.out.println(mara.solution(a, b));
   }

}
