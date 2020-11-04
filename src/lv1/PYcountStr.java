package lv1;

public class PYcountStr {
   boolean solution(String s) {
        boolean answer = true;
        int pcnt=0;
        int ycnt=0;
        
        s=s.toUpperCase(); //문자열 영문을 전부다 대문자로 변경 <=> s.toLowerCase()
        for(int i=0; i<s.length(); i++) {
           if(s.charAt(i)=='P') {
              pcnt++;
           }else if(s.charAt(i)=='Y') {
              ycnt++;
           }
        }
        answer = (pcnt==ycnt ? true : false);
        
        return answer;
    }
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      PYcountStr py = new PYcountStr();
      System.out.println(py.solution("Pyy"));
   }

}
