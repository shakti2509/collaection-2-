package ass3;

import java.util.*;


public class Demo {
	public static void main(String[] args) {
		// Set<Employee> emp=new TreeSet<Employee>();
		List<Employee> emp = new LinkedList<>();
		emp.add(new Employee(12, "amardeepp", 34432.3));
		emp.add(new Employee(1234, "deepp", 34432.3));
		emp.add(new Employee(122, "amar", 34432.3));
		emp.add(new Employee(1, "iam", 34432.3));
		emp.add(new Employee(14, "sandeep", 34432.3));
		emp.add(new Employee(13, "newvhj", 34432.3));
		emp.add(new Employee(2, "jhbhbjkn", 34432.3));
		emp.add(new Employee(10, "ajbjkh", 34432.3));
		for (Employee et : emp)
			System.out.println(et);

		
		
		
		Collections.sort(emp, new Sortoneid());
		System.out.println("-----------------------------------------------------------");
		for (Employee et : emp)
			System.out.println(et);

	}

}
