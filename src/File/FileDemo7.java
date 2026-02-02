package file;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileDemo7 {
	public static void main(String[] args) {
		File f1=new File("D:\\aaa");
		HashMap<String, Integer> count = getCount(f1);
		System.out.println(count);
		
		
	}
	public static HashMap<String,Integer> getCount(File file){
		HashMap<String,Integer>hm=new HashMap<>();
		File[] files = file.listFiles();
		if (files != null) {
			for (File file1 : files) {
				if(file1.isFile()){
					String[] arr = file1.getName().split("\\.");
					if(arr.length>=2){
						String endName = arr[arr.length - 1];
						hm.put(endName, hm.getOrDefault(endName,0)+1);
					}
				}else{
					HashMap<String, Integer> sumMap = getCount(file1);
					Set<Map.Entry<String, Integer>> entries = sumMap.entrySet();
					for (Map.Entry<String, Integer> entry : entries) {
						String key = entry.getKey();
						Integer value = entry.getValue();
						hm.put(key, hm.getOrDefault(key,0)+value);
					}
				}
			}
		}
		return hm;
	}
	
}
