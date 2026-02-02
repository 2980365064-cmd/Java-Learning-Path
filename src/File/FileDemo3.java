package file;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
	public static void main(String[] args) throws IOException {
		File f1=new File("D:\\GithubRepository\\Java-Learning-Path\\src\\PokerGame\\c.txt");
		boolean b = f1.createNewFile();
		System.out.println(b);
		File f2=new File("D:\\GithubRepository\\Java-Learning-Path\\src\\PokerGame\\ddd");
		System.out.println(f2.mkdir());
		System.out.println(f2.delete());
	}
}
