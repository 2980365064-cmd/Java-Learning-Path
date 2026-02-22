package mystatic;

public class OverSeasStudents extends Student {
	 public void lunch(){
		 super.eat();
	 }
	@Override
	public  void eat(){
		System.out.println("吃意大利面");
	}
}
