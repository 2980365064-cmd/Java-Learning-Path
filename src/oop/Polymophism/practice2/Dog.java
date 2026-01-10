package oop.polymophism.practice2;

public class Dog extends Animal{

	public Dog(String name,int age,String color) {
		super(name,age,color);
	
	}
	
	public void houseKeeping(){
		System.out.println("狗在看家");}
	@Override
	public void eat(String something){
		System.out.println("狗抱着"+something+"吃");
	}


}
