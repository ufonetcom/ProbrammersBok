package otc4th;

import java.util.HashMap;

public class Ep4 {
	public int[] solution(String s) {
        int[] answer = {};
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        char x = s.charAt(0);
        map.put(x, 1);
        for(int i=1; i<s.length(); i++) {
        	if(x == s.charAt(i)) {
        		map.put(x, map.getOrDefault(x, 0)+1);
        	}
        	x = s.charAt(i);
        	
        }
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ep4 sol = new Ep4();

		//입력값


		System.out.println(sol.solution(""));
	}

}