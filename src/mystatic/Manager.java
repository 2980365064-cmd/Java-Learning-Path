package mystatic;

public class Manager extends Employee{
	private double bonus;
	
	public Manager() {
	}
	
	public Manager(String id, String name, int salary,double bonus) {
		super(id,name,salary);
		this.bonus = bonus;
	}
	@Override
	public void work(){
		System.out.println("经理在管理他人");
	}
	/**
	 * 获取
	 * @return bonus
	 */
	public double getBonus() {
		return bonus;
	}
	
	/**
	 * 设置
	 * @param bonus
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
}
