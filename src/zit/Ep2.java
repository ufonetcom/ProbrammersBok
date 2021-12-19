package zit;

public class Ep2 {
    public String solution(int n, String[] GAN, String[] JI, String[] JI2, String[] HANG) {
    	String answer = Integer.toString(n)+" : ";
		int g = n% GAN.length;
		int j = n% JI.length;

		answer += GAN[g]+JI[j]+"년 - "+HANG[g/2]+JI2[j];
        return answer;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ep2 sol = new Ep2();

		//입력값
		String[] GAN = { "경", "신", "임", "계", "갑", "을", "병", "정", "무", "기" };
		String[] JI = { "신", "유", "술", "해", "자", "축", "인", "묘", "진", "사","오","미"};
		String[] JI2 = { "원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양" };
		String[] HANG = { "백", "흑", "청", "적", "황금"};
		int ans = 1592;
		System.out.println(sol.solution(ans,GAN,JI,JI2,HANG));

		
		
	}

}