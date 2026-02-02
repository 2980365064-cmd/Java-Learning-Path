package file;

import java.io.File;

public class FileDemo4 {
	public static void main(String[] args) {
		File f1=new File("D:\\GithubRepository\\Java-Learning-Path\\src\\PokerGame");
		File[] files = f1.listFiles();
		for (File file : files) {
			System.out.println(file);
		}
	}
}
