package oop.polymophism.practice2;

public class Cat extends Animal {
	public Cat(String name,int age,String color) {
		super(name,age,color);
		
	}
	

	public void catMouse(){
		System.out.println("猫抓老鼠");}
	@Override
	public void eat(String something){
		System.out.println("猫眯着眼睛"+"吃"+something);
	}
	
}
