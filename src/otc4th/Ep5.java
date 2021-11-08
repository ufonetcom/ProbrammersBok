package otc4th;

import java.util.Arrays;

public class Ep5 {
	public int[][] solution(int rows, int columns) {
		int[][] answer = new int[rows][columns];
		int cnt = 0;
		int r=0, c=0;
		int zerocnt = rows*columns;

		//2차원배열을 처음부터 끝까지 서치하는 문제가 아니기 때문에 while을 돌림.
		while (zerocnt > 0){
			if(answer[r][c] == 0){
				zerocnt--;
			}
			cnt++;
			answer[r][c] = cnt;
			if(answer[r][c]%2==0){ //짝수일때
				if(r==rows-1) r=0;
				else r++;
				if(answer[r][c] == 1) break;
			}else {
				if(c==columns-1) c=0;
				else c++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ep5 sol = new Ep5();

		//입력값
		int rows = 3;
		int columns = 4;

		int[][] ans = sol.solution(rows,columns);

		System.out.print("[");
		for(int i=0; i<rows; i++){
			System.out.print("[");
			for(int j=0; j<columns; j++){
				System.out.print(ans[i][j]);
				if(j!=columns-1) System.out.print(",");

			}
			System.out.print("]");
			if(i!=rows-1) System.out.print(",");
		}
		System.out.print("]");

//		System.out.println(Arrays.deepToString(sol.solution(rows,columns)));
	}

}