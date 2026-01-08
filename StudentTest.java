package test;

public class StudentTest {
	public static void main(String[] args) {
		Student []arr=new Student[3];
		Student student1=new Student("张三",1,15);
		Student student2=new Student("李四",2,14);
		Student student3=new Student("王五",3,12);
		arr[0]=student1;
		arr[1]=student2;
		arr[2]=student3;
		Student student4=new Student("赵六",4,13);
		Student[] arr1=new Student[arr.length];
		boolean flag=contain(arr,4);
		//determine whether the add method should be implemented
		if(flag){
			System.out.println("学号重复，请重新添加");
		}else {
			
			int count = count(arr);
			System.out.println(count);
		        arr1 = assignment(arr, count, student4);
			System.out.println("以下是添加后学生的信息");
			for (int i = 0; i < arr1.length; i++) {
				System.out.println("姓名" + arr1[i].getName()
					+ " " + "ID：" + arr1[i].getNumber() + " " + "年龄：" + arr1[i].getAge());
			}
		}
		boolean flag1=	contain(arr1,4);
		if (flag1){
			arr1=cancel(arr1,4);
			System.out.println("以下是删除后学生的信息");
			arr1=cancel(arr1,5);
			for (int i = 0; i < arr1.length; i++) {
				if(arr1[i]!=null){
					System.out.println("姓名" + arr1[i].getName()
						+ " " + "ID：" + arr1[i].getNumber() + " " + "年龄：" + arr1[i].getAge());
				}
			}
			
		}
		else{
			System.out.println("学生ID不存在，请重新输入");
		}
		
	}
	//check the duplicate student ID
	public static boolean contain (Student[]arr,int id){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=null&&id==arr[i].getNumber()){
				return true;
			}
		}
		return false;
		
	}
	//calculate how many student IDs are in the array
	public static int count (Student []arr){
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=null){
				count++;
				
			}
		}
		return count;
	}
	//copy the original array to the new array
	public static Student[] copy (Student []arr){
		Student []arr1=new Student[arr.length+1];
		for (int i = 0; i < arr.length; i++) {
			arr1[i]=arr[i];
		}
		return arr1;
	}
	//add the  new student information  to the new array
	public static Student[] assignment (Student[]arr,int count,Student student4){
		if(count< arr.length){
			arr[count]=student4;
			return arr;
		}else{
			Student []arr1=copy(arr);
			arr1[arr.length]=student4;
			return arr1;
		}
		
	}
	//remove the information of the selected  student
	public static Student[] cancel (Student[]arr,int id){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=null&&arr[i].getNumber()==id){
				arr[i]=null;
			}
		}
		
		return arr;
	}
}
