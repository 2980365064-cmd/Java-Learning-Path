package file;

import java.io.File;
import java.io.IOException;

public class FileDemo5 {
	public static void main(String[] args) throws IOException {
		File f1=new File("D:\\aaa");
		System.out.println(f1.mkdirs());
		File f2=new File("D:\\aaa\\aaa.txt");
		System.out.println(f2.createNewFile());
		boolean b=haveAvi(f1);
		System.out.println(b);
	}
	public static boolean haveAvi(File file){
		File[] files = file.listFiles();
		for (File file1 : files) {
			if(file1.isFile()&&file1.getName().endsWith(".mp4")){
				return true;
			}
			if(file1.isDirectory()){
				return haveAvi(file1);
			}
		}
		return false;
	}
}
