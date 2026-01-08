package com.example.helloworld;

import java.util.Scanner;
//键盘录入一个字符串，
//要求1:长度为小于等于9
//要求2:只能是数字
//将内容成罗马数字
//下面是阿拉伯数字跟罗马数字的对比关系:
//1-1、11-2、I1l-3、IV-4、V-5、VI-6、Vl-7、VIl-8、IX-9注意点:
//罗马数字里面是没有0的
//如果键盘录入的数字包含0，可以变成""(长度为0的字符串)
public class demo55nananananan {
	public static void main(String[] args) {
		Scanner  sc =new Scanner(System.in);
		System.out.println("请输入字符串");
		String str =sc.next();
		boolean flag =judge(str);
		while(!flag){
			System.out.println("请重新输入字符串");
			 str =sc.next();
			 flag =judge(str);
		}
		convert(str);
		
	}
	//determine whether the string length meets the requirements
	public static boolean judge (String str){
		boolean flag=true;
	if(str.length()>9){
		flag=false;
		System.out.println("字符串不符合要求请重新输入");
	}
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if(c>=57||c<=48){
				System.out.println("字符串不符合要求请重新输入");
				flag=false;
			}
		}
		return flag;
	}
	//convert the input number to a Roma number
	public static void convert (String str){
		String[]arr= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		StringBuilder s=new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			//charAt转化的是字符，不是数字
			int c=str.charAt(i)-48;
			s.append(arr[c]).append(' ');
		}
		
		System.out.println(s);
		
	}
}
