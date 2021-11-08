package otc4th;

import java.util.*;

public class Ep4 {
	public int[] solution(String s) {
		int[] answer = {};
		Queue<Character> queue = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();

		for(char x : s.toCharArray()){
			queue.add(x);
		}
		char tmp = s.charAt(s.length()-1); //마지막값을 큐의 첫값과 딱 한번만 비교하기 위하여 저장.
		for (int i = 0; i < queue.size(); i++) {
			if(queue.peek()==tmp){
				tmp = queue.poll();
				queue.add(tmp);
			}else break;
		}
		char[] result = new char[s.length()];
		for(int i=0; i<result.length; i++){
			result[i] = queue.poll();
		}

		char temp2 = result[0];
		int cnt = 1;
		for(int i=1; i<result.length; i++){
			if(result[i] == temp2){
				cnt++;
				if(i==result.length-1) list.add(cnt);
			}else {
				list.add(cnt);
				temp2 = result[i];
				cnt=1;
			}
		}
		Collections.sort(list);
		answer = new int[list.size()];
		for(int i=0; i<list.size(); i++){
			answer[i] = list.get(i);
		}


        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ep4 sol = new Ep4();

		//입력값
		String s = "aaabbaaa";
		String s2 = "wowwow";
		System.out.println(Arrays.toString(sol.solution(s)));

//		for(int v : sol.solution(s)){
//			System.out.println("["+v+",]");
//		}
	}

}