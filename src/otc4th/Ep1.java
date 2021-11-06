package otc4th;

import java.util.ArrayList;
import java.util.HashMap;

public class Ep1 {
	public int[] solution(int[] arr) {
        int[] answer = new int[3];
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        
        for(int i=1; i<4; i++) {
        	map.put(i, 0);
        }
        for(int x : arr) {
        	map.put(x, map.get(x)+1);
        }
        int max = Integer.MIN_VALUE;
        for(int x : map.keySet()) {
        	if(map.get(x)>max) {
        		max = map.get(x);
        	}
        }
        System.out.println("max = "+max);
        int cnt=0;
        for(int x : map.keySet()) {
        	answer[cnt++] = max-map.get(x);
        }
        
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ep1 sol = new Ep1();

		//입력값

		int[] arr = {3, 3, 3, 3, 3, 3};
		for(int x:sol.solution(arr)) {
			System.out.print(x+" ");
		}
		
	}

}