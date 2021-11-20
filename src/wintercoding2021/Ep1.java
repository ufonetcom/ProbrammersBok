package wintercoding2021;

import java.util.ArrayList;

class Monster{
	private String name;
	private int exp;
	private int mPee;
	private int mAttack;
	private int mDepence;
	
	private double resultExp;
	
	public Monster() {
	}
	
	public Monster(String name, int exp, int mPee, int mAttack, int mDepence, double resultExp) {
		this.name = name;
		this.exp = exp;
		this.mPee = mPee;
		this.mAttack = mAttack;
		this.mDepence = mDepence;
		this.resultExp = resultExp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getmPee() {
		return mPee;
	}

	public void setmPee(int mPee) {
		this.mPee = mPee;
	}

	public int getmAttack() {
		return mAttack;
	}

	public void setmAttack(int mAttack) {
		this.mAttack = mAttack;
	}

	public int getmDepence() {
		return mDepence;
	}

	public void setmDepence(int mDepence) {
		this.mDepence = mDepence;
	}

	public double getResultExp() {
		return resultExp;
	}

	public void setResultExp(double resultExp) {
		this.resultExp = resultExp;
	}
}

public class Ep1 {
	public String solution(String character, String[] monsters) {
        String answer = "";
        ArrayList<Monster> mList = new ArrayList<Monster>();
        String[] user = character.split(" ");
        
        int attack = Integer.parseInt(user[1]);
        int depence = Integer.parseInt(user[2]);
       
        
        for(int i=0; i<monsters.length; i++) {
        	int killTime = 0;
        	int pee = Integer.parseInt(user[0]);
        	String target = monsters[i];
        	String[] tar = target.split(" ");
        	
        	Monster monster = new Monster(tar[0],Integer.parseInt(tar[1]),Integer.parseInt(tar[2]),Integer.parseInt(tar[3]),Integer.parseInt(tar[4]),0.0);
        	
        	int downPee = attack - monster.getmDepence();
     
        	while(pee>0 && monster.getmPee() > 0) {
        		//1. 플레이어 -> 몬스터 (공격)
        		monster.setmPee(monster.getmPee() - downPee);
        		
        		killTime++;
        		if(monster.getmPee()<=0) {
        			double result = (double)(monster.getExp()/(double)killTime);
        			monster.setResultExp(result);
        			break;
        		}
        		
        		
        		//2. 몬스터 -> 플레이어 (공격)
        		pee = pee - (monster.getmAttack() - depence);
        		if(pee <= 0) {
        			monster.setResultExp(0.0);
        			break;
        		}
        		pee = Integer.parseInt(user[0]);
        	}
        	mList.add(monster);
        }
        
        for(Monster mon : mList) System.out.print("총 결과 : "+mon.getResultExp() + " ");
        System.out.println();
        
        Monster max = mList.get(0);
        for(int i=1; i<mList.size(); i++) {
        	Monster mon = mList.get(i);
        	
        	if(max.getResultExp() == mon.getResultExp()) {
        		if(max.getExp()>mon.getExp()) answer = max.getName();
        		else if(max.getExp() == mon.getExp()) {
        			answer = max.getName();
        			System.out.println(answer);
        		}
        		else {
        			answer = mon.getName();
        			max = mon;
        		}
        	}
        	else if(mon.getResultExp() > max.getResultExp()) {
        		answer = mon.getName();
        		max = mon;
        	}
        	else answer = max.getName();
        } 
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ep1 sol = new Ep1();

		//입력값
		String character = "10 5 2";
		String[] monsters = {"Knight 1 1 15 1","Wizard 3 1 15 1","Beginner 1 1 15 1"};
		
		System.out.println("결과 = "+sol.solution(character, monsters));
		
	}

}