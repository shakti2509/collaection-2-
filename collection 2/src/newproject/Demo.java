package newproject;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student>stu=new ArrayList<>();

		stu.add(new Student(101,"shakti"));
		stu.add(new Student(102,"sandeep"));
		stu.add(new Student(103,"anurag"));
		stu.add(new Student(104,"amardeep"));
		stu.add(new Student(105,"chetnya"));
		stu.add(new Student(106,"akash"));
		stu.add(new Student(107,"dodo"));
		stu.add(new Student(108,"jojo"));
		int ch;
		do {
			System.out.println("1: sorting by Name ");
			System.out.println("2: sorting by rollno ");
			System.out.println("0: sorting by Name ");
		
			Scanner sc=new Scanner(System.in);
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				Collections.sort(stu,new Namecom());
				for(Student st:stu)
					System.out.println(st);
				break;
			case 2:
				Collections.sort(stu,new Rnocom());
				for(Student st:stu)
					System.out.println(st);
				break;
			}
			}
			while(ch!=0);
			
		}}
		
		
	


