package lv1;

public class StringExercise {
    public String getMiddle(String s) {
           String answer = "";
           
           int length = s.length();
           if(length%2==0) {
              answer = s.substring(length/2-1, length/2+1);
           }else {
              answer = s.substring(length/2, length/2+1);
              
           }
           return answer;
       }
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      StringExercise strExercise = new StringExercise();
      System.out.println(strExercise.getMiddle("abcde"));
      System.out.println(strExercise.getMiddle("qwer"));
   }

}
