package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo5 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		Collections.addAll(list,"张无忌","张无忌","周芷若","赵敏","张强","张三十","张翠山","张良","王二麻子","谢广坤");
		ArrayList<String> list2 = new ArrayList<>();
		Collections.addAll (list2, "周芷若", "赵敏");
		Stream.concat(list.stream(),list2.stream()).forEach(s-> System.out.println(s));
	}
}
