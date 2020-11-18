package lv1;

public class HpStar {
   public String solution(String phone_number) {
        String answer = "";
        
        for(int i=0; i<phone_number.length(); i++) {
           if(i<phone_number.length()-4) {
              answer = answer + "*";
           }else {
              answer = answer + phone_number.charAt(i);
           }
        }
        
        return answer;
    }
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      HpStar hs = new HpStar();
      String phone_number = "01033334444";
//      String phone_number = "027778888";
      
      System.out.println(hs.solution(phone_number));
   }

}