package StudentManageSystem;

public class Student extends Person {
	
	private int age;
	private String address;
	
	public Student() {
	}
	
	public Student(String id, String name, int age, String address) {
		super(id,name);
		this.age = age;
		this.address = address;
	}
	
	/**
	 * 获取
	 * @return id
	 */

	
	/**
	 * 设置
	 * @param id

	/**
	 * 获取
	 * @return name
	 */

	/**
	 * 设置
	 * @param name
	 */
	
	/**
	 * 获取
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * 设置
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * 获取
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * 设置
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
