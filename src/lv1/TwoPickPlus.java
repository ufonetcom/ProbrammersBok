package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoPickPlus {
	public int[] solution(int[] numbers) {
		Arrays.sort(numbers);
		List<Integer> tmpList = new ArrayList<>();
		List<Integer> sumList = new ArrayList<>();

//      배열의 중복을 제거하고 중복된값은 합배열에 추가해주는 방법.
		tmpList.add(numbers[0]);
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] != numbers[i + 1]) {
				tmpList.add(numbers[i + 1]);

			} else {
				if (!sumList.contains(numbers[i] * 2)) {
					sumList.add(numbers[i] * 2);
				}
			}
		}
		
        //중복이 제거된 tmpList를 활용하여 더한값을 sumList에 넣어주는 방법.
		for (int i = 0; i < tmpList.size() - 1; i++) {
			for (int j = i + 1; j < tmpList.size(); j++) {
				int sum = tmpList.get(i) + tmpList.get(j);
				if (!sumList.contains(sum)) {
					sumList.add(sum);
				}
			}
		}
		
		Collections.sort(sumList);
		int[] answer = new int[sumList.size()];
		int k = 0;
		for (int tmp : sumList) {
			answer[k++] = tmp;
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoPickPlus tpp = new TwoPickPlus();
		int[] numbers = {2,1,3,4,1};
		//int[] numbers = {5,0,2,7};
		System.out.println(Arrays.toString(tpp.solution(numbers)));

	}

}
