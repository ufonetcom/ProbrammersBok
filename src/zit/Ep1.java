package zit;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ep1 {
    public String solution(int n) {
    	String answer = "";
		LinkedHashMap<Integer, Character> map = new LinkedHashMap<>();
		map.put(1000,'M');
		map.put(500,'D');
		map.put(100,'C');
		map.put(50,'L');
		map.put(10,'X');
		map.put(5,'V');
		map.put(1,'I');
		int mok = 0;
		for(int x : map.keySet()){
			System.out.println(map.get(x));
			if(n>=x){
				mok = n/x;
				n=n%x;
				for(int i=0; i<mok; i++){
					answer += map.get(x);
				}
			}
		}

        return answer;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ep1 sol = new Ep1();

		//입력값
		int n = 26;
		System.out.println(sol.solution(n));
		
		
	}

}