package lv1;

import java.util.Arrays;
import java.util.Collections;

public class DescNumber {
	public long solution(long n) {
        long answer = 0;
        String tmp = Long.toString(n);
        Long[] temp = new Long[tmp.length()];
        for(int i=0; i<tmp.length(); i++) {
        	temp[i] = (long) (tmp.charAt(i)-'0');
        }
        System.out.println(Arrays.toString(temp));
        
        Arrays.sort(temp,Collections.reverseOrder());//reverseOrder() 메소드는 primitiveType의 배열은 불가능. Wrapper class이용.
        for(long result : temp) {
        	answer *= 10;
        	answer += result;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DescNumber dn = new DescNumber();
		System.out.println(dn.solution(118372));

	}

}
