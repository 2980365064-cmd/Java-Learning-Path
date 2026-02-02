package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo8 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll (list, "张无忌-男-15","周芷若-女-14","赵敏-女-13","张强-男-20","张三丰-男-100","张翠山-男-40", "张良-男-35","王二麻子-男-37","谢广坤-男-41");
		List<String> newlist=list.stream()
			.filter(s->"男".equals(s.split("-")[1]))
			.collect(Collectors.toList());
		System.out.println(newlist);
		Map<String, Integer> collect = list.stream()
			.filter(s -> "男".equals(s.split("-")[1]))
			.collect(Collectors.toMap(new Function<String, String>() {
				@Override
				public String apply(String string) {
					String s = string.split("-")[0];
					return s;
				}
			}, new Function<String, Integer>() {
				@Override
				public Integer apply(String string) {
					String s = string.split("-")[2];
					return Integer.parseInt(s);
				}
			}));
		System.out.println(collect);
		Map<String, Integer> collect2 = list.stream()
			.filter(s -> "男".equals(s.split("-")[1]))
			.collect(Collectors.toMap(s ->s.split("-")[0],s->Integer.parseInt(s.split("-")[2])));
		System.out.println(collect2);
	}
}
