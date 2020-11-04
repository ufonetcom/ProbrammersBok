package lv1;

import java.util.Arrays;

public class Knumber {
   public int[] solution(int[] array, int[][] commands) {
		int[] convers = {};
		int[] answer = {};
		answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			//배열의 복사 (복사할 배열, 복사할 배열의 시작인덱스, 복사할 배열의 끝 인덱스(해당인덱스 전까지))
			convers = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			Arrays.sort(convers);
			answer[i] = convers[commands[i][2] - 1];
		}
		return answer;
    }
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Knumber knum = new Knumber();
      int arr[]= {15, 95, 42, 36, 3, 7, 4};
      int[][] comm = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
      System.out.println(Arrays.toString(knum.solution(arr, comm)));
   }

}
