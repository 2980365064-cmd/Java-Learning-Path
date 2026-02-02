package stream;

import java.util.stream.Stream;

public class StreamDemo4 {
	public static void main(String[] args) {
		Stream.of(1,23,4,5,67).forEach(s-> System.out.println(s));
	}
}
