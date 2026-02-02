package stream;

import java.util.*;
import java.util.function.IntFunction;

public class StreamDemo7 {
	public static void main(String[] args) {
		Map<String,Integer>hm=new HashMap<>();
		Set<String> set = hm.keySet();
		for (String s : set) {
		
		}
		ArrayList<String> list=new ArrayList<>();
		Collections.addAll(list,"张无忌","张无忌","周芷若","赵敏","张强","张三十","张翠山","张良","王二麻子","谢广坤");
		System.out.println(list.stream().count());
		System.out.println(Arrays.toString(list.stream().toArray()));
		String[]arr=list.stream().toArray(new IntFunction< String[]>() {
			@Override
			public String[] apply(int value) {
				return new String[value];
			}
		});
		System.out.println(Arrays.toString(arr));
	}
}
