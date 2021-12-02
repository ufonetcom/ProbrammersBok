package siliconvalley2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Student{
	private String name;
	private int num; //순위
	private int distance; //거리
	private int gradeFirst; //점수
	
	public Student(String name, int num, int distance, int gradeFirst) {
		this.name = name;
		this.num = num;
		this.distance = distance;
		this.gradeFirst = gradeFirst;
	}
	
	public Student() {
	}

	public String getName() {
		return name;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getDistance() {
		return distance;
	}

	public int getGradeFirst() {
		return gradeFirst;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", num=" + num +
				", distance=" + distance +
				", gradeFirst=" + gradeFirst +
				'}';
	}
}

class StuComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getGradeFirst()<o2.getGradeFirst()) return 1;
		else if(o1.getGradeFirst()>o2.getGradeFirst()) return -1;
		else {
			if(o1.getDistance()<o2.getDistance()) return 1;
			else if(o1.getDistance()>o2.getDistance()) return -1;
			else {
				return o1.getName().compareTo(o2.getName());
			}
		}
	}
}

public class Ep2 {
	public int[] solution(String[] names, int[][] homes, double[] grades) {
        int[] answer = new int[names.length];
        ArrayList<Integer> disList = new ArrayList<>();
        ArrayList<Student> stu = new ArrayList<Student>();
        ArrayList<Student> originStu = new ArrayList<Student>();

		//homes의 거리 구하기
		int dis;
		for(int j=0; j<homes.length; j++) {
			dis = 0;
			for(int k=0; k<homes[j].length; k++) {
				dis = dis + (int)(Math.pow(Math.abs(homes[j][k]),2));
			}
			disList.add(dis);
		}

		//student객체에 생성자 이용하여 각각 값 담기.
        for(int i=0; i<names.length; i++) {
        	Student student = new Student(names[i], i+1, disList.get(i), (int)grades[i]); 
        	stu.add(student);
			originStu.add(student);
        }


		//정렬 출력
		Collections.sort(stu, new StuComparator());
		int p=1;
		for(Student x : stu){
			System.out.print(x + " // ");
			x.setNum(p++);
		}

		System.out.println();
		for(int i=0; i<answer.length; i++){
			answer[i] = originStu.get(i).getNum();
		}

        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ep2 sol = new Ep2();

		//입력값
//		String[] names = {"azad","andy","louis","will","edward"};
//		int[][] homes = {{3,4},{-1,5},{-4,4},{3,4},{-5,0}};
//		double[] grades = {4.19, 3.77, 4.41, 3.65, 3.58};
		String[] names = {"clanguage","csharp","java","python"};
		int[][] homes = {{3,-3},{-2,7},{-1,1},{5,4}};
		double[] grades = {1.27, 4.31, 4.26, 3.99};

		for(int x : sol.solution(names, homes, grades)){
			System.out.print(x + " ");
		}
	}

}