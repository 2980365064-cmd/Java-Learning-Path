package file;

import java.io.File;

public class FileDemo6 {
	public static void main(String[] args) {
		File f1=new File("D:\\aaa");
		delete1(f1);
	}
	public static void delete1 (File file){
		File[] files = file.listFiles();
		if (files != null) {
			for (File file1 : files) {
				if(file1.isFile()){
				 file1.delete();
				}else{
				     delete1(file1);
				}
				file.delete();
			}
		}
	}
}
