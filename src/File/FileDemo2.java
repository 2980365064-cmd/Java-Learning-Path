package file;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		File f1=new File("D:\\GithubRepository\\Java-Learning-Path\\src\\PokerGame\\a.txt");
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
		System.out.println(f1.exists());
		System.out.println(f1.length());
		String absoluteFile = f1.getAbsolutePath();
		System.out.println(absoluteFile);
		
		File f2=new File("helloworld\\a.txt");
		System.out.println(f2.getAbsolutePath());
		System.out.println(f2.getName());
		System.out.println(f2.getPath());
		
	}
}
