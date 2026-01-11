package StudentManageSystem;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//store students instance
		ArrayList<Student> list = new ArrayList<>();
		//store user instance
		ArrayList<User> list1 = new ArrayList<>();
		//start interface
		boolean flag2 = true;
		
		loop2:	while (true) {
				boolean flag = true;
				System.out.println("----------欢迎来到学生管理系统----------");
				System.out.println("请选择操作1登录，2注册，3忘记密码");
				int x = sc.nextInt();
				switch (x) {
					case 1 ->flag2=log(list1, flag);
					case 2 -> flag2=register(list1,flag);
					case 3 -> flag2=forgot(list1,flag);
				}
				if(flag2){
					break loop2;
				}
				
			}
		loop:	while (true) {
			System.out.println("1:添加学生");
			System.out.println("2:删除学生");
			System.out.println("3:修改学生");
			System.out.println("4:查询学生");
			System.out.println("5:退出");
			
			int choose = sc.nextInt();
			
			switch (choose) {
				case 1 -> add(list);
				case 2 -> del(list);
				case 3 -> mod(list);
				case 4 -> query(list);
				case 5 -> {
					System.out.println("退出");
					break loop;
				}
				default -> System.out.println("没有这个选项");
			}
			
		}
	}
	
	//Implement adding students information
	public static void add(ArrayList<Student> list) {
		System.out.println("添加学生");
		Student st1 = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("输入学生ID");
		String id = sc.next();
		st1.setId(id);
		System.out.println("输入学生姓名");
		String name = sc.next();
		st1.setName(name);
		System.out.println("输入学生年龄");
		int age = sc.nextInt();
		st1.setAge(age);
		System.out.println("输入学生住址");
		String address = sc.next();
		st1.setAddress(address);
		list.add(st1);
		System.out.println(list.get(0).getName());
		System.out.println(list.get(0).getAge());
		System.out.println(list.get(0).getAddress());
		System.out.println(list.get(0).getId());

	}
	
	//Modify student information
	public static void mod(ArrayList<Student> list) {
		System.out.println("修改学生信息");
		boolean flag = true;
		loop:
		while (flag) {
			System.out.println("1：修改学号");
			System.out.println("2：修改姓名");
			System.out.println("3：修改年龄");
			System.out.println("4：修改住址");
			System.out.println("回退");
			Scanner sc = new Scanner(System.in);
			System.out.println("输入你想修改的信息");
			int choose = sc.nextInt();
			switch (choose) {
				case 1 -> modifyId(list);
				case 2 -> modifyName(list);
				case 3 -> modifyAge(list);
				case 4 -> modifyAddress(list);
				case 5 -> {
					System.out.println("退出");
					break loop;
				}
			}
		}
		
	}
	
	//Modify student id
	public static void modifyId(ArrayList<Student> list) {
		Scanner sc = new Scanner(System.in);
		String id  ;
		boolean flag = true;
		int count = 0;
		boolean flag2 = true;
		//find out target student
	loop:	while (flag2) {
			System.out.println("输入你要修改学号的学生姓名");
			String name = sc.next();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equals(name)) {
					count = i;
					flag2 = false;
					break loop;
				}
			}
			System.out.println("输入姓名有误，请重新输入");
		}
		
		loop:
		while (flag) {
			System.out.println("输入你想修改的学号");
			id = sc.next();
			System.out.println("修改后的ID是" + " " + id);
			System.out.println("确定修改请输入1，重新修改请输入2");
			boolean flag1 = true;
			while (flag1) {
				int i = sc.nextInt();
				if (i == 1) {
					flag = false;
					flag1 = false;
					list.get(i).setId(id);
				} else if (i == 2) {
					System.out.println("请重新修改");
					flag1 = false;
				} else {
					System.out.println("输入非法，请重新输入");
				}
			}
			
		}
		
	}
	
	//Modify student name
	public static void modifyName(ArrayList<Student> list) {
		Scanner sc = new Scanner(System.in);
		String name1;
		boolean flag = true;
		int count = 0;
		boolean flag2 = true;
		loop:	while (flag2) {
			System.out.println("输入你要修改的学生姓名");
			name1 = sc.next();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equals(name1)) {
					count = i;
					flag2 = false;
					break loop;
				}
			}
			System.out.println("输入姓名有误，请重新输入");
		}
		while (flag) {
			System.out.println("请输入修改后的姓名");
			String name2 = sc.next();
			System.out.println("修改后的姓名是" + " " + name2);
			System.out.println("确定修改请输入1，重新修改请输入2");
			boolean flag1 = true;
			while (flag1) {
				int i = sc.nextInt();
				if (i == 1) {
					flag = false;
					flag1 = false;
					list.get(count).setName(name2);
					System.out.println("修改成功");
				} else if (i == 2) {
					System.out.println("请重新修改");
					flag1 = false;
				} else {
					System.out.println("输入非法");
				}
			}
		}
	}
	
	//Modify student age
	public static void modifyAge(ArrayList<Student> list) {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		boolean flag = true;
		int count = 0;
		boolean flag2 = true;
		String name;
	loop:	while (flag2) {
			System.out.println("输入你要修改年龄的学生姓名");
			name = sc.next();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equals(name)) {
					count = i;
					flag2 = false;
					break loop;
				}
			}
			System.out.println("输入姓名有误，请重新输入");
		}
		while (flag) {
			while (flag) {
				System.out.println("输入你想修改的年龄");
				age = sc.nextInt();
				System.out.println("修改后的年龄是" + " " + age);
				System.out.println("确定修改请输入1，重新修改请输入2");
				boolean flag1 = true;
				while (flag1) {
					int i = sc.nextInt();
					if (i == 1) {
						flag = false;
						flag1 = false;
						list.get(count).setAge(age);
					} else if (i == 2) {
						System.out.println("请重新修改");
						flag1 = false;
					} else {
						System.out.println("输入非法");
					}
				}
			}
		}
	}
	
	//Modify student address
	public static void modifyAddress (ArrayList < Student > list) {
			String address;
			Scanner sc = new Scanner(System.in);
			boolean flag = true;
			int count = 0;
			boolean flag2 = true;
			String name;
	loop:	while (flag2) {
			System.out.println("输入你要修改年龄的学生姓名");
			name = sc.next();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equals(name)) {
					count = i;
					flag2 = false;
					break loop;
				}
			}
			System.out.println("输入姓名有误，请重新输入");
		}
			while (flag) {
				
				while (flag) {
					System.out.println("输入你想修改的住址");
					address = sc.next();
					System.out.println("修改后的住址是" + " " + address);
					System.out.println("确定修改请输入1，重新修改请输入2");
					boolean flag1 = true;
					while (flag1) {
						int i = sc.nextInt();
						if (i == 1) {
							flag = false;
							flag1 = false;
							list.get(count).setAddress(address);
						} else if (i == 2) {
							System.out.println("请重新修改");
							flag1 = false;
						} else {
							System.out.println("输入非法");
						}
					}
				}
			}
		}
		
	//delete student information
	public static void del (ArrayList<Student>list){
		boolean flag2=true;
		String name;
		int count;
		Scanner  sc =new Scanner(System.in);
			System.out.println("输入你要修改年龄的学生姓名");
			name = sc.next();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equals(name)) {
					count = i;
					flag2 = false;
					list.remove(i);
					System.out.println("已找到学生,并为你删除");
				}
			}
			if(!flag2) {
				System.out.println("输入姓名有误，返回主菜单");
			}
	}
	//query student information
	public static void query (ArrayList<Student>list){
		Scanner  sc =new Scanner(System.in);
		String name;
		loop:	while (true) {
			System.out.println("输入你要查询年龄的学生姓名");
			name = sc.next();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equals(name)) {
					String id=list.get(i).getId();
					int age=list.get(i).getAge();
					String address=list.get(i).getAddress();
					System.out.println("您查询的学生信息如下");
					System.out.println("姓名:"+ name+" ID:"+id+" 年龄:"+
					age+" 住址："+address);
					break loop;
				}
			}
			System.out.println("输入姓名有误，请重新输入");
		}
	}
	//register account
	public static boolean register (ArrayList<User>list1,boolean flag) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		boolean flag1 = true;
		loop:
		while (true) {
			System.out.println("请输入用户名,用户名由至少有一个数字和一个字母组成");
			String name = sc.next();
			 flag1 = duplicated(name, list1, flag);
			if (flag1) {
				//determine whether name is consist of digit and letter
				boolean flag2 = lengthType(name, flag);
				if (flag2) {
					user.setName(name);
					System.out.println("用户名可用，修改后姓名：" + name);
					break loop;
				} else {
					System.out.println("用户名不可用，请重新输入");
				}
			}
		}
		loop1:
		while (true) {
			System.out.println("请输入密码,密码只能为数字");
			int passWord1 = sc.nextInt();
			System.out.println("请再次输入密码");
			int passWord2 = sc.nextInt();
			if (passWord2 == passWord1) {
				System.out.println("密码注册成功");
				user.setPassWord(passWord1);
				break loop1;
			} else {
				System.out.println("两次密码输入不一致，请重新输入");
			}
		}
		loop2:
		while (true) {
			System.out.println("输入身份证号");
			String id = sc.next();
			boolean flag3 = verifyID(id, flag);
			if (flag3) {
				System.out.println("身份证验证成功");
				user.setId(id);
				break loop2;
			} else {
				System.out.println("身份验证失败，请重新输入");
			}
		}
		loop3:
		while (true) {
			System.out.println("输入手机号");
			String number = sc.next();
			boolean flag4 = verifyPhoneNumber(number, flag);
			if (flag4) {
				System.out.println("手机号正确");
				user.setPhoneNumber(number);
				System.out.println("注册成功");
				break loop3;
			} else {
				System.out.println("手机号输入有误，请重新输入");
			}
		}
		list1.add(user);
		System.out.println(list1.get(0).getName());
		flag=false;
		return flag;
	}
	//determine duplicated information
	public static boolean duplicated (String name,ArrayList<?extends Person>list1,boolean flag){
		 if(!list1.isEmpty()) {
			 for (int i = 0; i < list1.size(); i++) {
				 if (Objects.equals(list1.get(i).getName(), name)) {
					 System.out.println("姓名重复,重新输入");
					 flag = false;
					 break;
				 }
			 }
		 }
		return flag;
	}
	//determine username length and type
	public static boolean lengthType (String name,boolean flag) {
	  int A=0;
	  int B=0;
		for (int i = 0; i < name.length(); i++) {
			char c=name.charAt(i);
			if(c>='0'&&c<='9'){
				A=1;
			}else if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
				B=1;
			}
		}
		if(name.length()<3||name.length()>15){
			flag=false;
			System.out.println("用户名长度必须在3到15之间");
		}
		if(!(A==1&&B==1)){
			flag=false;
		}
		return flag;
	}
	//verify ID card
	public static boolean verifyID(String id, boolean flag){
		if(id.length()!=18||id.charAt(0)=='0'){
			flag=false;
		}else{String first=id.substring(0,17);
		      String last=id.substring(17);
			for (int i = 0; i < first.length(); i++) {
				char c=first.charAt(i);
				if(!(c>='0'&&c<='9')){
	                         flag=false;
				}
			}
			if (!((last.charAt(0)>='0'&&last.charAt(0)<='9')||(last.charAt(0)=='x'||last.charAt(0)=='X'))){
				flag=false;
			}
		}return flag;
	}
	//verify PhoneNumber
	public static boolean verifyPhoneNumber  (String number,boolean flag){
		if(number.length()!=11||number.charAt(0)=='0'){
			flag=false;
		}
		for (int i = 0; i < number.length(); i++) {
			char c=number.charAt(i);
			if (!(c >= '0' && c <= '9')) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	//log account
	public static boolean log (ArrayList<User>list,boolean flag){
		       Scanner  sc =new Scanner(System.in);
		       boolean flag2=true;
		       int index=0;
		String yzm=verificationCode();
		
	loop1:	while (true){
		System.out.println("验证码为"+yzm);
		System.out.println("输入验证码");
		String yzm1=sc.next();
	     if(yzm.equals(yzm1)){
		     System.out.println("验证码正确");
		     break loop1;
	     }else {
		     System.out.println("验证码错误，重新输入");
	     }}
		
		
		loop: for (int i = 0; i <3 ; i++) {
			System.out.println("请输入用户名");
			String name=sc.next();
			for (int j = 0; j < list.size(); j++) {
				if (Objects.equals(list.get(j).getName(), name)) {
					index=j;
					flag2=false;
				}
			}
			if(flag2){
				System.out.println("用户未注册，请先进行注册");
				flag=false;
				break loop;
			}
			System.out.println("请输入密码");
			int passWord=sc.nextInt();
			int passWord1=list.get(index).getPassWord();
			if (passWord==passWord1&&Objects.equals(list.get(index).getName(), name)) {
				System.out.println("登陆成功");
				flag=true;
				break loop;
			}else {
				System.out.println("用户名或密码错误，请重新输入");
				flag=false;
			}
		}
		if(!flag&&!flag2){
			System.out.println("你已经三次输入密码，即将返回主页面");
		}
	
		return flag;
	}
	//create a verification code
	public static  String  verificationCode (){
		Random rd = new Random();
		StringBuilder sb=new StringBuilder();
		char[]digits={'1','2','3','4','5','6','7','8','9'};
		int digitIndex=rd.nextInt(1,digits.length);
		char[]letters=new char[52];
		for (int i = 0; i < 26; i++) {
			letters[i]=(char)('A'+i);
		}
		for (int i = 0; i < 26; i++) {
			letters[i+26]=(char)('a'+i);
		}
		
		for (int i = 0; i < 4; i++) {
			int letterIndex=rd.nextInt(1,27);
			sb.append(letters[letterIndex]);
		}
		sb.append(digits[digitIndex]);
		char[]code=sb.toString().toCharArray();
		//random character index
		int randomIndex=rd.nextInt(0,4);
		char c=code[randomIndex];
		code[randomIndex]=code[code.length-1];//change letter and digit
		code[code.length-1]=c;
		return new String(code);
	}
	//forgot passWord
	public static boolean forgot (ArrayList<User>list,boolean flag){
		int index=0;
		boolean flag2=true;
		Scanner  sc =new Scanner(System.in);
		System.out.println("输入你的用户名，用户名只能由数字和字母组成");
		String name=sc.next();
		for (int i = 0; i < list.size(); i++) {
			if(Objects.equals(list.get(i).getName(), name)){
				index=i;
				break;
			}
		}if(index==0){
			System.out.println("用户名未注册，请先注册");
			flag2=false;
		}
		if(flag2){
			System.out.println("用户存在，请输入身份证");
			String id=sc.next();
			System.out.println("请输入手机号");
			String number=sc.next();
			if(!Objects.equals(id, list.get(index).getId())
			||! Objects.equals(number, list.get(index).getPhoneNumber())){
				System.out.println("身份信息不匹配，验证失败");
			}
			else {
				System.out.println("验证成功，请输入新密码");
				int passWord=sc.nextInt();
				list.get(index).setPassWord(passWord);
				System.out.println("密码修改成功，修改后的密码为"+passWord);
			}
		}
		flag=false;
		return flag;
	}

	
}