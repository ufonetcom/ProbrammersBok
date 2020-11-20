package lv1;


public class SizerPwd {
   public String solution(String s, int n) {
        String answer = "";
        
        char[] ch = s.toCharArray();
        
        for(int i=0; i<ch.length; i++) {
           if(ch[i]==' ') {
              ch[i]=' ';
           }
           
//           대문자일때 (아스키코드 65~90) else if(65<=ch[i] && ch[i]<=90)
           else if(Character.isUpperCase(ch[i])){
              if(ch[i]+n<=90) {
                 ch[i]=(char) (ch[i]+n);
              }else {
                 ch[i]=(char)(ch[i]+n-26);
              }
           }
//           소문자일때 (아스키코드 97~122) else if(97<=ch[i] && ch[i]<=122)
           else if(Character.isLowerCase(ch[i])) {
              if(ch[i]+n<=122) {
                 ch[i]=(char) (ch[i]+n);
              }else {
                 ch[i]=(char)(ch[i]+n-26);
              }
           }

           answer = answer+ch[i];
        }
        
        return answer;
    }
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      SizerPwd sp = new SizerPwd();
      System.out.println(sp.solution("a B z", 4));
   }

}
