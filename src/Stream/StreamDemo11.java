package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo11 {
	public static void main(String[] args) {
		ArrayList<String>manList=new ArrayList<>();
		ArrayList<String>womanList=new ArrayList<>();
		Collections.addAll(manList, "梁朝伟，24", "叶剑威，23", "刘不对，22", "吴签，24", "谷嘉，30", "肖梁梁，27");
		Collections.addAll(womanList, "赵小颖，35", "杨颖，36", "高元元，43", "张天天，31", "刘思思，26", "杨小幂，33");
		Stream<String> stream1 = manList.stream()
			.filter(s -> s.split("，")[0].length() == 3)
			.limit(2);
		
		Stream<String> stream2 = womanList.stream()
			.filter(s -> '杨' == s.split("，")[0].charAt(0))
			.skip(1);
		List<Actor> list = Stream.concat(stream1, stream2).map(s -> new Actor(s.split("，")[0], Integer.parseInt(s.split("，")[1])))
			.collect(Collectors.toList());
		System.out.println(list);
	}
}
