package test;

import java.util.Random;

public class RoleTest {
	public static void main(String[] args) {
		Role r1=new Role("伍钰涛",100,"男");
		Role r2=new Role("唐凯",100,"男");
		r1.ShowRole();
		r2.ShowRole();
		Random rd = new Random();
		int judge= rd.nextInt(0,2);
		//Determine which executes first via Random
		if(judge==0){
			System.out.println(r1.getName()+"先手亲吻对方肛门");
			r1.attack(r2);
		}
		else {
			System.out.println(r2.getName()+"先手亲吻对方肛门");
			r2.attack(r1);
		}
		//Implement the game mechanism that the higher HP attack first
		while (r1.getBlood()>0&&r2.getBlood()>0) {
			if (r1.getBlood() > r2.getBlood()) {
				r2.attack(r1);
			} else  {
				r1.attack(r2);
			}
			
		}
		//Execution completed and print the result
		if (r1.getBlood()>r2.getBlood()){
			System.out.println(r1.getName()+"获胜，加冕为真正的肛门之王，重铸肛门荣光");
		}
		else {
			System.out.println(r2.getName()+"获胜，加冕为真正的肛门之王，重铸肛门荣光");
		}
		
	}
}
