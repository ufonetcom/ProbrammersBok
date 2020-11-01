package lv1;

public class FindKim {
	public String findKim(String[] seoul) {
        String answer = "";
        
        for(int i=0; i<seoul.length; i++) {
        	if(seoul[i].equals("Kim")) {
        		answer = "김서방은 "+i+"에 있다";
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindKim kimsearch = new FindKim();
		String[] names = {"Jane","lee","Kim",};
		System.out.println(kimsearch.findKim(names));

	}

}
