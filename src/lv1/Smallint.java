package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Smallint {
	public int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length==1) {     //원소가 하나일때는 무조건 -1 반환.
        	answer = new int[1];
        	answer[0] = -1;
        }else {
        	List<Integer> tmpList = new ArrayList<>();   //sort에 쓰여 '가장 작은 값 찾기'까지 쓰이는 arraylist
        	List<Integer> submitList = new ArrayList<>();
        	
        	for(int i=0; i<arr.length; i++) {      //배열을 서로다른 ArrayList 2개에 담음.
        		tmpList.add(arr[i]);
        		submitList.add(arr[i]);
        	}
        	
        	Collections.sort(tmpList);   //sort시켜 가장 작은값 몰아넣기.tmpList={1,2,3,4}
        	int del = tmpList.get(0);    //가장 작은 값은 index=0에 위치, 변수에 담음
        	
        	for(int j=0; j<submitList.size(); j++) {
        		if(submitList.get(j)==del) {         //submitList {4,3,2,1}이 들어있는 원소중 작은값 1이 같으면 삭제.
        			submitList.remove(j);
        		}
        	}
        	
        	answer = new int[arr.length-1];
        	for(int i=0; i<answer.length; i++) {
        		answer[i]=submitList.get(i);
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smallint sm = new Smallint();
		int[] arr = {4,3,2,1};
		System.out.println(Arrays.toString(sm.solution(arr)));
	}

}
