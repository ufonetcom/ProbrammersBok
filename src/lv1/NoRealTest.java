package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoRealTest {
   public int[] solution(int[] answers) {
        int[] answer = {};
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] thr = {3,3,1,1,2,2,4,4,5,5};
        
        //학생1, 학생2, 학생3 각각의 정답횟수를 tmpcnt 배열의 원소로 설정하고 정답일때만 해당 인덱스에 값을 증가시킨다.
        int[] tmpcnt = new int[3];
        for(int i=0; i<answers.length; i++) {
           if(answers[i]==one[i%5]) {
              tmpcnt[0]++;
           }
           if(answers[i]==two[i%8]) {
        	   tmpcnt[1]++;
           }
           if(answers[i]==thr[i%10]) {
        	   tmpcnt[2]++;
           }
        }
        //정답횟수가 들어있는 학생배열의 최대값 원소를 max로 빼낸다..
        int max=tmpcnt[0];
        for(int i=1; i<tmpcnt.length; i++) {
           if(max<tmpcnt[i]) {
        	   max=tmpcnt[i];
           }
        }
        
        //최대값 변수인 max와 각 학생들의 정답횟수를 비교하여, 동일한 최고점 학생의 인덱스를 얻어내 arrayList에 저장시킨다.
        List<Integer> resultcnt = new ArrayList<>();
        for(int i=0; i<tmpcnt.length; i++) {
        	if(max==tmpcnt[i]) {
        		resultcnt.add(i+1);
        	}
        }
        
        //마지막으로 리스트를 배열로 변환한다.
        answer = new int[resultcnt.size()];
        for(int i=0; i<resultcnt.size(); i++) {
           answer[i] = resultcnt.get(i);
        }
        
        return answer;
    }
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      NoRealTest real = new NoRealTest();
//      int[] arr = {1,2,3,4,5};
      int[] arr = {1,3,2,4,2};
      System.out.println(Arrays.toString(real.solution(arr)));
   }

}
