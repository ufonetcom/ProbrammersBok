package lv1;

public class ArrNaeJuk {
	public int solution(int[] a, int[] b) {
        int answer = 1234567890;
        int multiplyTmp = 0;
        for(int i=0; i<a.length; i++) {
        	multiplyTmp += a[i]*b[i];
        }
        answer = multiplyTmp;
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrNaeJuk anj = new ArrNaeJuk();
//		int[] a = {1,2,3,4};
		int[] a = {-1,0,1};
//		int[] b = {-3,-1,0,2};
		int[] b = {1,0,-1};
		System.out.println(anj.solution(a, b));
	}

}
