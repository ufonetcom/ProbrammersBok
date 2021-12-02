package siliconvalley2021;

import java.util.ArrayList;

class Student{
	private String name;
	private int num;
	private int distance;
	private int gradeFirst;
	
	public Student(String name, int num, int distance, int gradeFirst) {
		super();
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
	
	public int getDistance() {
		return distance;
	}

	public int getGradeFirst() {
		return gradeFirst;
	}
}

public class Ep2 {
	public int[] solution(String[] names, int[][] homes, double[] grades) {
        int[] answer = {};
        ArrayList<Integer> disList = new ArrayList<>();
        ArrayList<Student> stu = new ArrayList<Student>();
        
        
        for(int i=0; i<names.length; i++) {
        	
        	int dis = 0;
        	for(int j=0; j<homes.length; j++) {
        		dis = 0;
        		for(int k=0; k<homes[j].length; k++) {
        			dis = dis + (int)(Math.pow(Math.abs(homes[j][k]),2));
        			
        		}
        		
        		disList.add(dis);
        	}
        	
        	Student student = new Student(names[i], i+1, disList.get(i), (int)grades[i]); 
        	stu.add(student);
        }
        
        Student tmp = stu.get(0);
        for(int i=1; i<names.length; i++) {
        	if(tmp.getGradeFirst()<=stu.get(i).getGradeFirst()) {
        		tmp = stu.get(i);
        		stu.remove(i);
        		stu.add(0,tmp);
        	}
        }
        for(Student student : stu) {
        	System.out.print(student.getDistance()+" ");
        }
        
        int lt = 0;
        for(int i=0; i<stu.size()-1; i++) {
        	if(stu.get(i).getGradeFirst() == stu.get(i+1).getGradeFirst()) {
        		lt++;
        		
        	}else {
        		Student temp = stu.get(i-lt);
        		for(int j=i-lt; j<i; j++) {
        			if(temp.getDistance()<stu.get(j+1).getDistance()) {
        				
        			}
        		}
        		lt=0;
        	}
        }
        
        
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ep2 sol = new Ep2();

		//입력값
		String[] names = {"azad","andy","louis","will","edward"};
		int[][] homes = {{3,4},{-1,5},{-4,4},{3,4},{-5,0}};
		double[] grades = {4.19, 3.77, 4.41, 3.65, 3.58};

		System.out.println(sol.solution(names, homes, grades));
	}

}