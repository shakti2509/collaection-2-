package newproject;

public class Student {
	private int  ron;
	private String name;
	public Student(int ron, String name) {
		super();
		this.ron = ron;
		this.name = name;
	}
	public Student() {
		super();
	}
	public int getRon() {
		return ron;
	}
	public void setRon(int ron) {
		this.ron = ron;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [ron=" + ron + ", name=" + name + "]";
	}
	


}
