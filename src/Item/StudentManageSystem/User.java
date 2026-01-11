package StudentManageSystem;

public class User extends  Person {
	
	private int passWord;
	
	private String   phoneNumber;
	
	
	public User() {
	}
	
	public User(String Name, int passWord, String id, String phoneNumber) {
		super(id,Name);
		this.passWord = passWord;
		this.phoneNumber = phoneNumber;
	}
	

	public int getPassWord() {
		return passWord;
	}
	
	/**
	 * 设置
	 * @param passWord
	 */
	public void setPassWord(int passWord) {
		this.passWord = passWord;
	}
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * 设置
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
