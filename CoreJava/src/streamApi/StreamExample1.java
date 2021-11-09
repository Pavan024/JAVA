package streamApi;

import java.util.ArrayList;
import java.util.List;

class Employee {
	long empId;
	String empName;
	double sal;

	public Employee(long empId, String empName, double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal=" + sal + "]";
	}

}

public class StreamExample1 {

	public static void main(String[] args) {

		Employee e1 = new Employee(1l, "venkatesh", 15000d);
		Employee e2 = new Employee(2l, "rajesh", 14000d);
		Employee e3 = new Employee(3l, "ramesh", 20000d);
		Employee e4 = new Employee(4l, "sravan", 5000d);
		Employee e5 = new Employee(5l, "uday", 35000d);
		Employee e6 = new Employee(6l, "srinu", 19000d);
		List<Employee> employees = new ArrayList<Employee>();

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);

		System.out.println("----------------------------------------------------------------");
		employees.stream().dropWhile(e -> e.empId <= 3l).forEach(e -> System.out.println(e));
		System.out.println("----------------------------------------------------------------");
		boolean b = employees.stream().noneMatch(e -> e.empName.equals("Pavan"));
		System.out.println(b);
		System.out.println("----------------------------------------------------------------");
		employees.stream().skip(2).forEach(e -> System.out.println(e));
		System.out.println("----------------------------------------------------------------");

	}

}
