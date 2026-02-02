package stream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo1 {
	public static void main(String[] args) {
	ArrayList<String>list=new ArrayList<>();
	Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三十","张翠山","张良","王二麻子","谢广坤");
	list.stream().filter( string->string.startsWith("张")).forEach(s-> System.out.println(s));
	list.stream().skip(3).forEach(s-> System.out.println(s));
	
	
	}
}
