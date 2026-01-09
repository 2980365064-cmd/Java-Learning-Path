package mystatic;

public class ArrayUtil {
	//private the constructor ,no instantiation
	private ArrayUtil(){
	
	}
	//print and return the content of arr
	public static String printArr(int[]arr){
		StringBuilder sb =new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1){
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]).append(",");
			}
			
			
		}
		sb.append("]");
		return sb.toString();
	}
	//get average of arr
	public static double getAve (double []arr){
	double sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		return sum/arr.length;
	}
}
