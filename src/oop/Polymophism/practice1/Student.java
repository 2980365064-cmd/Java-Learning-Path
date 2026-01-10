package oop.polymophism.practice1;

public class Student extends Person {
	public Student(String name,int age) {
		super(name,age);
	}
	@Override
	public void show(){
		System.out.println("学生信息："+getName()+","+getAge());
	}
	public void study(){
		System.out.println("学生在学习");
	}
}
