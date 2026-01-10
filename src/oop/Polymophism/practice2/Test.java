package oop.polymophism.practice2;

public class Test {
	public static void main(String[] args) {
		Person p1=new Person("老王",30);
		Person p2=new Person("老李",25);
		Animal a=new Dog("狗",3,"蓝色");
		Animal b=new Cat("猫",2,"白色");
		System.out.println(p1.getAge()+"岁的"+p1.getName()+"养了一条"+a.getColor()+a.getAge()+"岁的狗");
		p1.keepPet(a,"屎");
		System.out.println(p2.getAge()+"岁的"+p2.getName()+"养了一条"+b.getColor()+b.getAge()+"岁的狗");
		p2.keepPet(b,"鱼肉");
		//determine instance type and cast to the required type
		if(a instanceof Dog d){
			d.houseKeeping();
		}else if(a instanceof Cat c){
			c.catMouse();
		}
		if(b instanceof Dog d){
			d.houseKeeping();
		}else if(b instanceof Cat c){
			c.catMouse();
		}
	}
}
