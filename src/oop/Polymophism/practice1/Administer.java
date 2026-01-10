package oop.polymophism.practice1;

public class Administer extends Person {
	public Administer(String name,int age) {
		super(name,age);
	}
	@Override
	public void show(){
		System.out.println("管理员信息："+getName()+","+getAge());
	}
}
