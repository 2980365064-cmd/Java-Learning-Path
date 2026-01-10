package oop.polymophism.practice1;

public class Test {
	public static void main(String[] args) {
	Teacher t=new Teacher("张三",23);
	Student s=new Student("大娃",13);
	Administer a=new Administer("二娃",25);
	Person p=new Student("大娃",13);
	p.show();
	
if(p instanceof Teacher t1){
	t1.show();
}else if(p instanceof Student s1){
	s1.study();
}
	}
	public static void register (Person p){
		p.show();
	}
}
