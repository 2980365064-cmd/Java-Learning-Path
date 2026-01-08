package com.example.helloworld;
//给定两个字符串，A和B。
//A 的旋转操作就是将A最左边的字符移动到最右边。
// 例如，若A='abcde'，在移动一次之后结果就是'bcdea'。
// 如果在若干次调整操作之后，A能变成B，那么返回True
// 。如果不能匹配成功，则返回false
public class demo56nananan {
	public static void main(String[] args) {
	String A="abcd";
	String B="cdab";
	boolean flag=false;
		for (int i = 0; i < A.length(); i++) {
			A=rotate(A);
			 flag =determine(A,B);
			if (flag){
				System.out.println(flag+" "+A);
				break;
			}
		}
		System.out.println(flag);
	}
	//rotate the string
	//parameter:the string before rotation
	public static String rotate (String str){
	//get the first character
	char first =str.charAt(0);
	String end =str.substring(1);
		System.out.println(end+first);
	return end+first;
	
	}
	//determine whether two strings are same
	public static boolean determine (String strA,String strB){
		boolean flag =false;
		if(strA.equals(strB)){
			flag=true;
		}
		return  flag;
	}
}

