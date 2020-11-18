package lv1;

public class AvgArr {
	   public double solution(int[] arr) {
	        double answer = 0;
	        int sum=0;
	        for(int i=0; i<arr.length; i++) {
	           sum += arr[i];
	        }
	        answer=(double)sum/arr.length;
	        return answer;
	    }
	   public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      AvgArr aa = new AvgArr();
	      int[] arr = {1,2,3,4};
//	      int[] arr = {5,5};
	      System.out.println(aa.solution(arr));

	   }

	}