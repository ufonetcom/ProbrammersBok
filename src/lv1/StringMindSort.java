package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringMindSort {
	public String[] solution(String[] strings, int n) {
        String[] answer = {};
        List<String> tempList = new ArrayList<>();
        List<String> copyStrings = new ArrayList<>();
        
        Arrays.sort(strings);  //strings배열의 n번째 원소값이 같을때를 대비하여 초반에 정렬
        
        for(String arr : strings) {  //strings배열을 copyStrings 리스트에 담는다.
        	copyStrings.add(arr);
        }
        
        for(int i=0; i<strings.length; i++) {  //strings배열의 n번째 요소들을 따로빼서 tempList에 담는다.
        	tempList.add(strings[i].substring(n,n+1)); //""+strings[i].charAt(i) 도 가능.
        }
        
        Collections.sort(tempList);     //요소들을 정렬한다(사전순)
        
        answer = new String[strings.length];
        for(int i=0; i<tempList.size(); i++) {  //{c,c,x} {a,e,u} 정렬된 n번째 요소 리스트의 값들과
        	for(int j=0; j<copyStrings.size(); j++) {   //[abcd, abce, cdx]  {bed,car,sun} 정렬된 단어 리스트를 비교하여 answer배열에 담는다.
        		
        		if(copyStrings.get(j).substring(n,n+1).equals(tempList.get(i))) { //copyString(단어리스트)의 j번째요소를 tempList(단어의 n번째요소리스트)와 비교하여 같으면
        			answer[i]=copyStrings.get(j); //단어리스트의 j번째 요소를 정답배열에 넣는다.
        			copyStrings.remove(j); //그리고 j번째 요소를 지운다. 그 요소가 빠지고 앞으로 요소들이 땡겨지면서 j번째 요소는 앞으로 비교를 할 수 없다.
        			break; //j for문을 한번 돌때 정답은 하나임으로 정답을 찾으면 빠져나와 다음 n번째 요소리스트와 비교한다.
        		}
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMindSort sms = new StringMindSort();
		
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		
//		String[] strings = {"abce", "abcd", "cdx"};
//		int n = 2;
		System.out.println(Arrays.toString(sms.solution(strings, n)));

	}

}
