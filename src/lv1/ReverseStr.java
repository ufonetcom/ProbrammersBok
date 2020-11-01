package lv1;

import java.util.Arrays;

public class ReverseStr {
	public String reverseStr(String s) {
        String answer = "";
//      1.이렇게 하려면 배열에 for문을 돌려서 원소 저장을 따로 해줘야함
//        char[] change = new char[s.length()];
        
//      2.Arrays.sort(ch); //char형의 배열 원소를 정렬해주는 함수.
//        //정렬된 ch배열을 builder의 reverse()함수로 역순서 배열을 시킨 후 toString()함수를 써서 출력
//        answer = new StringBuilder(new String(ch)).reverse().toString();
        char[] ch = s.toCharArray();  //**가장 중요!! String형의 위치를 바꾸어 줄수는 없어서 하나의 문자를 문자 배열로 변환 시켜줘야함.
        char tmp=' ';
        for(int i=0; i<ch.length; i++) {
        	for(int j=i+1; j<ch.length; j++) {
        		if(ch[i]<ch[j]) {
        			tmp=ch[j];
        			ch[j]=ch[i];
        			ch[i]=tmp;
        		}
        	}
        }
        answer = String.valueOf(ch); //문자형을 String형으로 만들어 담는 함수.
//        answer = new String(ch);  //동일 기능.
        
        return answer;
    }
	
	public static void main(String[] args) {
		ReverseStr reverseStr = new ReverseStr();
		System.out.println(reverseStr.reverseStr("Zbcdefg"));
		System.out.println(reverseStr.reverseStr("bcdfgaz"));
	}

}
