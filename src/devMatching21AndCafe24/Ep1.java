package devMatching21AndCafe24;

public class Ep1 {

	public String solution(String[] registered_list, String new_id) {
       String answer = "";
       int lengthNew = new_id.length();
       boolean loofResult = true;
       int i=0;
       
       
        while(loofResult) {
        	System.out.println("count = "+ i++);
        	boolean hasId = false;
        	String same_id = "";
        	System.out.println("new_id = " + new_id);
        	
        	for(int k=0; k<registered_list.length; k++) {
        		if(registered_list[k].equals(new_id)) {
        			same_id = new_id;
        			hasId = true;
        			System.out.println("same Id!!!");
        			break;
        		}
        	}
        	
        	if(hasId == false) {
        		System.out.println("not same Id");
    			answer = new_id;
        		loofResult = false;
        	}
        	
        	if(hasId) {
        		System.out.println("has Id!!!");
        		for(int j=0; j<same_id.length(); j++) {
        			int find_idx = 0;
        			
        			if(same_id.charAt(j) >= 48 && same_id.charAt(j) <= 57) {
        				find_idx = j;
        				String sS = same_id.substring(0, j);
        				String numberString = same_id.substring(j);
        				
        				System.out.println("sS = " + sS);
        				System.out.println("numberString = " + numberString);
        				
        				int num = Integer.parseInt(numberString);
        				num = num + 1;
        				System.out.println("num = " +num);
        				
        				new_id = sS + num;
        				System.out.println("for nuew id = " + new_id);
        				break;
        			}
        		}
        		System.out.println("forAN");
        		if(lengthNew == new_id.length()) {
        			System.out.println("N이 없을때!!");
        			int notFind_idx = 0;
            		new_id = same_id + Integer.toString(notFind_idx + 1);
            		System.out.println("n없을때 new_id = "+new_id);
        		}
        	}
            		
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ep1 ep1 = new Ep1();
		
		//입력값
//		String[] registered_list = {"card", "ace13", "ace16", "banker", "ace17", "ace14"};
		String[] aa = {"cow", "cow1", "cow2", "cow3", "cow4", "cow9", "cow8", "cow7", "cow6", "cow5"};
		
//		String new_id = "ace15";
		String aa1 = 	"cow";
		
		//테스트 출력
//		System.out.println(ep1.solution(registered_list, new_id));
		System.out.println("출력값 = "+ep1.solution(aa, aa1));

	}

}
