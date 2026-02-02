package stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StreamDemo3 {
	public static void main(String[] args) {
		HashMap<String,Integer>hm=new HashMap<>();
		hm.put("aaa",111);
		hm.put("bbb",222);
		hm.put("ccc",333);
		hm.put("ddd",444);
		Set<Map.Entry<String, Integer>> entries = hm.entrySet();
		entries.stream().forEach(s-> System.out.println(s));
	}
}
