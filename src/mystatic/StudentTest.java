package mystatic;

import java.util.ArrayList;

public class StudentTest {
	public static void main(String[] args) {
		//create a collection to store objects
		ArrayList<Student> list=new ArrayList<>();
		Student st1 =new Student("zhangsan",23,"男");
		Student st2 =new Student("lisi",93,"女");
		Student st3 =new Student("wangwu",26,"男");
		Student st4=new Student();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		//use StudentUtil to get the max age
		int max=StudentUtil.age(list);
		System.out.println("最大年龄为"+max);
		OverSeasStudents ot=new OverSeasStudents();
		ot.eat();
		ot.lunch();
	}
}
