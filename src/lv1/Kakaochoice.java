package lv1;

import java.util.Stack;

public class Kakaochoice {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		
		Stack<Integer> basket = new Stack<Integer>();

		for (int i = 0; i < moves.length; i++) { // 세로
			for (int j = 0; j < board.length; j++) { // 가로

				if (board[j][moves[i] - 1] != 0 && !basket.empty()) { //크래인이 뽑으려 하는 인형이 있고, basket이 비어있지 않을때 )

					if (basket.peek() == board[j][moves[i] - 1]) {
						
						board[j][moves[i] - 1] = 0; // board 인형 지우기
						basket.pop(); // basket 맨위 인형 지우기(꺼내기)
						
						answer += 2; // board에서 뽑은 인형과 basket인형 이 같을때 answer에 두개 추가.

					} else if (basket.peek() != board[j][moves[i] - 1]) {
						basket.push(board[j][moves[i] - 1]);
						board[j][moves[i] - 1] = 0;
					}
					break;
					
				} else if (board[j][moves[i] - 1] != 0 && basket.empty()) { //basket이 비어있을때
					basket.push(board[j][moves[i] - 1]);
					board[j][moves[i] - 1] = 0;
					break;
				}

			}
		}
		return answer;
	}
	public static void main(String[] args) {
		
		 Kakaochoice kakao = new Kakaochoice();
	      int[][] board = {
	                   {0,0,0,0,0},
	                   {0,0,1,0,3},
	                   {0,2,5,0,1},
	                   {4,2,4,4,2},
	                   {3,5,1,3,1}};
//	                    1,2,3,4,5
	      int[] moves = {1,5,3,5,1,2,1,4};
	      System.out.println(kakao.solution(board, moves));

	}

}
