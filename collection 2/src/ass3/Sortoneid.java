package ass3;

import java.util.*;

public class Sortoneid  implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (o1.getEid()-o2.getEid());
	}
}
