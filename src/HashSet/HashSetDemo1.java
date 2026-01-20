package LambdaDemo;

import java.util.TreeSet;

public class HashSetDemo1 {
	public static void main(String[] args) {
		Student s1=new Student("zhangsan",23);
		Student s4=new Student("zhangsan",23);
		Student s2=new Student("wangwu",24);
		Student s3=new Student("lisi",25);
		TreeSet<Student>hs=new TreeSet<>();
		hs.add(s2);
		hs.add(s1);
		hs.add(s3);
		System.out.println(hs.add(s4));
		System.out.println(hs);
	}
}
