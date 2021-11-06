package otc4th;
public class Ep2 {
	public String solution(String[] log) {
        String answer = "";
        int resultTime = 0;
        
        for(int i=1; i<log.length; i=i+2) {
        	String[] startTime = log[i-1].split(":");
        	String[] stopTime = log[i].split(":");
        	int stopH = Integer.parseInt(stopTime[0]);
        	int startH = Integer.parseInt(startTime[0]);
        	int stopM = Integer.parseInt(stopTime[1]);
        	int startM = Integer.parseInt(startTime[1]);
        	int studyTime = 0;
        	
        	if(stopH>startH) {
        		studyTime = (stopH-startH)*60;
        		if(stopM>startM) studyTime = studyTime + (stopM-startM);
        		else if(stopM<startM) studyTime = studyTime - (startM-stopM);
        				
        		if(studyTime>105) studyTime = 105;
        	}else if(stopH==startH) {
        		studyTime = stopM-startM;
        		if(studyTime<5) studyTime=0;
        	}
        	
        	resultTime += studyTime;
        	System.out.println("resultT = "+resultTime);
        	
        	
        }
        int hours = resultTime/60;
        int min = resultTime%60;
        if(hours<10) answer = "0"+Integer.toString(hours)+":"+Integer.toString(min);
        else answer = Integer.toString(hours)+":"+Integer.toString(min);
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ep2 sol = new Ep2();

		//입력값
		//String[] arr = {"08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"};
		String[] arr = {"01:00", "08:00", "15:00", "15:04", "23:00", "23:59"};

		System.out.println(sol.solution(arr));
	}

}