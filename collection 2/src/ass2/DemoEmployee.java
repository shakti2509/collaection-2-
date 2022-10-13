
package ass2;

import java.util.*;

public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> emp=new TreeSet<Employee>();
		emp.add(new Employee(23,"sandeep",352.445));
		emp.add(new Employee(24,"mandeep",3772.445));
		emp.add(new Employee(25,"randeep",3532.445));
		emp.add(new Employee(26,"jkjfkasjfk",3572.445));
		emp.add(new Employee(27,"kuldeep",36672.445));
		emp.add(new Employee(28,"anurag",32652.445));
		
		for( Employee Employee:emp)
		{
			System.out.println(Employee);
		}

	}

}
