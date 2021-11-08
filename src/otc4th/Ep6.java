package otc4th;
public class Ep6 {
	public String solution(double time, String[][] plans) {
		String answer = "";

		double gotoWorkTimeOnMonday = 13;
		double offWorkTimeOnMonday = 18;
		double gotoWorkTimeOnFriday = 9.5;
		double offWorkTimeOnFriday = 18;

		for (int i = 0; i < plans.length; i++) {
			double realT = (int)time*60; // 0.5당 30분,,,휴가시간
			String loc = plans[i][0]; //위치 ex)"홍콩"
			String startT = plans[i][1]; //출발 시간 ex)11PM
			String arriveT = plans[i][2]; //도착 시간 ex)9PM

			int startTR = reversToAmPm(subStringTime(startT),subStringAmpm(startT)); //ex)24시 기준표현식, 21(시)
			int arriveTR = reversToAmPm(subStringTime(arriveT), subStringAmpm(arriveT));

			if(startTR<offWorkTimeOnFriday){ //출발시간이 금요일 퇴근시간 전 일때
				realT -= (offWorkTimeOnFriday - startTR)*60;
			}
			if(arriveTR>gotoWorkTimeOnMonday){ //도착시간이 월요일 출근시간을 넘을때
				realT -= (arriveTR-gotoWorkTimeOnFriday)*60;
			}
			if(realT>0) answer = loc;
		}

		return answer;
	}
	//"12PM"에서 12(시간)을 자르기.
	private int subStringTime(String startT) {
		int time = Integer.parseInt(startT.substring(0,startT.length()-2));
		return time;
	}
	//"12PM"에서 PM을 자르기.
	private String subStringAmpm(String startT) {
		String ampm = startT.substring(startT.length()-2);
		return ampm;
	}
	//AM,PM을 적용시켜 24시간 표현식으로 변환.
	private int reversToAmPm(int startTR, String startTAmPm){
		if(startTAmPm.equals("PM")) startTR = startTR+12;
		return startTR;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ep6 sol = new Ep6();

		//입력값
		double time = 3.5;
		String[][] plans = {{"홍콩","6PM","5PM"},{"엘에이","11PM","9AM"}};

		System.out.print(sol.solution(time, plans));
	}

}