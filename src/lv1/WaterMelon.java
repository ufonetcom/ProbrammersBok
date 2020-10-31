package lv1;
//수박수문제
public class WaterMelon {
	 public String watermelon(int n) {
	        String answer = "";
	        
	        for(int i=0; i<n; i++) {
				if(i%2==0) {
					answer +="수";
				}else if(i%2!=0) {
					answer +="박";
				}
			}
	        
	        return answer;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterMelon wm = new WaterMelon();
		System.out.println("n이 3인 경우: " + wm.watermelon(3));
        System.out.println("n이 4인 경우: " + wm.watermelon(4));

	}

}
