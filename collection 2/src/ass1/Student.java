package ass1;

public class Student {
	
	private String  name;
	private int id; 
	private String city;
	private double per;
	public Student() {
		super();
	}
	public Student(String name, int id, String city, double per) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
		this.per = per;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", city=" + city + ", per=" + per + "]";
	}
	
	public boolean equals(Object obj)
	{
		Student temp=(Student)obj;
		boolean flag=false;
		if(this.id!=temp.id)
			flag=false;
		if(this.city==temp.city)
			flag=true;
	
		return flag;
	}
	public int hashCode() {

		return city.hashCode();	}
	
	

}
