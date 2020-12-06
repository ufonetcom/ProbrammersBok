package lv1;

public class StrangeNumber {
	   public String solution(String s) {
	        String answer = "";
	        int cnt = 0;
	        
	        s = s.toLowerCase(); 
	        String[] change = s.split("");
	        
	        for(int i=0; i<change.length; i++) {
	              if(change[i].equals(" ")) {
	                 answer += " ";
	                 cnt = 0;
	              }else {
	                 if(cnt%2==0) {
	                    answer += s.toUpperCase().charAt(i);
	                    cnt++;
	                 }else {
	                    answer += s.charAt(i);
	                    cnt++;
	                 }
	              }
//	           System.out.println("change["+i+"] : "+answer);
	        }
	        return answer;
	    }
	   public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      StrangeNumber sn = new StrangeNumber();
	      System.out.println(sn.solution("tryuiui  iiuuuhello ffffworld "));

	   }

	}
