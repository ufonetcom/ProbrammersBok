package lv1;

public class ControlStr {
	public boolean controlStr(String s) {
        boolean answer = true;
        
        if(s.length()==4 || s.length()==6) {
        	for(int i=0; i<s.length(); i++) {
        		if(s.charAt(i)>'A' && s.charAt(i)<'z') 
        			answer = false;
        	}
        }
        else 
        	answer=false;
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControlStr controlStr = new ControlStr();
		System.out.println(controlStr.controlStr("13445"));
		System.out.println(controlStr.controlStr("a445"));
		System.out.println(controlStr.controlStr("1445"));

	}

}
