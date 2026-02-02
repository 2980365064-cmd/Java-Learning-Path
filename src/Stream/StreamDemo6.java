package stream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo6 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		Collections.addAll(list,"张无忌-11","周芷若-12","赵敏-13","张强-14","张三十-15");
		list.stream().map( s-> Integer.parseInt(s.split("-")[1])).forEach(s-> System.out.println(s));
	}
}
