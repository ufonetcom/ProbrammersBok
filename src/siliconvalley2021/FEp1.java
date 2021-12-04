package siliconvalley2021;



public class FEp1 {
	public int solution(String[] drum) {
        int answer = -1;
        
        for(int i=0; i<drum.length; i++) {
        	int down = 0;
        	int lr = i;
        	int starCount = 0;
        	
        	while(down < drum.length) {
        		System.out.println("down : "+ down);
        		if(drum[down].charAt(lr)=='#') down++;
        		else if(drum[down].charAt(lr)=='<') lr--;
        		else if(drum[down].charAt(lr)=='>') lr++;
        		else {
        			starCount++;
        			if(starCount==2) break;
        			down++;
        		}
        		System.out.println("down after: "+ down);
        	}
        	if(down==drum.length) answer++;
        }
        answer++;
        return answer;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FEp1 sol = new FEp1();

		//입력값
		String[] drum = {"######",">#*###","####*#","#<#>>#",">#*#*<","######"};
		System.out.println(sol.solution(drum));
		
		
	}

}