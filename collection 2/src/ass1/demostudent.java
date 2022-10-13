package ass1;
import java.util.*;

public class demostudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("sandeep",44,"pune",78.33);
		Student s1=new Student("mandeep",474,"pue",77.33);
		Student s2=new Student("hardeep",54,"pujfe",76.33);
		Student s3=new Student("sarndeep",64,"punjje",88.33);
		Student s4=new Student("pardeep",44,"pune",75.33);
		Set<Student>student=new HashSet<Student>();
		student.add(s);
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		for(Student stu: student)
			System.out.println(stu);

		
	}

}
