package newproject;

import java.util.Comparator;

public class Rnocom implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (o1.getRon()-o2.getRon());
	}
	

}
