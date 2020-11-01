package lv1;

public class FindSosu {
	public int findSosu(int n) {
        int answer = 0;
//        int tot=0;
        for(int i=2; i<=n; i++) {
        	for(int j=2; j<=i; j++) {
        		if(i%j==0 && i!=j) {
//        			tot++;
        			break;
        		}if(i==j){
        			answer++;
        		}
//        		if(j==i/2) {
//        			answer++;
//        			break;
//        		}
        		
        	}
        }
//        answer = (n-1)-tot;
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindSosu findSosu = new FindSosu();
		System.out.println(findSosu.findSosu(5));
	}

}
