package oop.polymophism.practice1;

public class Teacher extends Person {
	
	public Teacher(String name,int age) {
		super(name,age);
	}
	
	@Override
	
	public void show(){
		System.out.println("老师信息："+getName()+","+getAge());
	}
	
	public String toString() {
		return "Teacher{}";
	}
}
