package StudentManageSystem;

public class Person {
	private String id;
	private String name;
	
	
	public Person() {
	}
	
	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/**
	 * 获取
	 * @return id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * 设置
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * 获取
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 设置
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Person{id = " + id + ", name = " + name + "}";
	}
}

