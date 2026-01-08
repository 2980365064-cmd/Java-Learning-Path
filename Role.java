package test;

import java.util.Objects;
import java.util.Random;

public class Role {
	private String name;
	private int blood;
	private String gender;
	private String face;
	String[] boyFace = {"玉树临风", "相貌堂堂", "英俊潇洒", "眉清目秀", "面如冠玉"};
	String[] girlFace = {"沉鱼落雁", "闭月羞花", "亭亭玉立", "明眸皓齿", "天生丽质"};
	String[] Moves={"%s用肛门夹住%s脑袋，并狠狠放了一个屁","%s掰开%s的肛门，然后暴风吸入"
		,"%s用肛门发射连环炮弹，击飞%s","%s用头攻击%s肛门，造成肛裂","%s用舌头重击%s肛门","%s用自己肛门和%s肛门硬碰硬"};
	public Role() {
	}
	
	public Role(String name, int blood, String gender) {
		this.name = name;
		this.blood = blood;
		this.gender = gender;
		setFace(gender);
	}
	
	/**
	 * 获取
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 设置
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 获取
	 * @return blood
	 */
	public int getBlood() {
		return blood;
	}
	
	/**
	 * 设置
	 * @param blood
	 */
	public void setBlood(int blood) {
		this.blood = blood;
	}
	
	public void attack(Role role){
		//Random damage
		Random rd = new Random();
		int hurt=rd.nextInt(1,21);
		int index = rd.nextInt(Moves.length);
	       int remainblood= role.getBlood()-hurt;
		remainblood=remainblood<0?0:remainblood;
		role.setBlood(remainblood);
		System.out.printf(Moves[index],this.getName(),role.getName());
		System.out.println("造成了"+hurt+"点伤害"
			+"，剩余"+remainblood+"滴血量");
	
	}
	
	/**
	 * 获取
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * 设置
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * 获取
	 * @return face
	 */
	public String getFace() {
		return face;
	}
	
	/**
	 * 设置
	
	 */
	public void setFace(String gender) {
		//Random appearance,varying by gender
		Random rd = new Random();
		int index=rd.nextInt(girlFace.length);
		if(Objects.equals(this.gender, "男")){
			face=boyFace[index];
		}
		else if (Objects.equals(this.gender, "女")){
			face=girlFace[index];
		}else{
			face="面目狰狞";
		}
		this.face = face;
	}
	
	/**
	 * 获取
	 * @return boyFace
	 */
	public String[] getBoyFace() {
		return boyFace;
	}
	
	/**
	 * 设置
	 * @param boyFace
	 */
	public void setBoyFace(String[] boyFace) {
		this.boyFace = boyFace;
	}
	
	/**
	 * 获取
	 * @return girlFace
	 */
	public String[] getGirlFace() {
		return girlFace;
	}
	
	/**
	 * 设置
	 * @param girlFace
	 */
	public void setGirlFace(String[] girlFace) {
		this.girlFace = girlFace;
	}
	public void ShowRole (){
		System.out.println("选手:"+getName());
		System.out.println("性别:"+getGender());
		System.out.println("外貌:"+getFace());
		System.out.println("血量:"+getBlood());
	}
}
