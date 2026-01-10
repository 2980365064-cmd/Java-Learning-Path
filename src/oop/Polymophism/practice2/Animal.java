package oop.polymophism.practice2;

public class Animal {
	private String name;
	private int age;
	private String color;
	
	public Animal() {
	}
	
	public Animal(int age, String color) {
		this.age = age;
		this.color = color;
	}
	
	public Animal(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
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
	 * @return color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * 设置
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	public void eat(String something){
		System.out.println("吃"+ something);
	}
	public String toString() {
		return "Animal{age = " + age + ", color = " + color + "}";
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
}
