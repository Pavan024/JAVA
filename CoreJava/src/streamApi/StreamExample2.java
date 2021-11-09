package streamApi;

import java.util.ArrayList;
import java.util.Collections;

class Employees implements Comparable<Employees> {
	long empId;
	String empName;
	double sal;

	public Employees(long empId, String empName, double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal=" + sal + "]";
	}

	@Override
	public int compareTo(Employees o) {
		if (this.empId > o.empId) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class StreamExample2 {

	public static void main(String[] args) {

		Employees e1 = new Employees(1l, "venkatesh", 15000d);
		Employees e2 = new Employees(2l, "rajesh", 14000d);
		Employees e3 = new Employees(3l, "ramesh", 20000d);
		Employees e4 = new Employees(4l, "sravan", 5000d);
		Employees e5 = new Employees(5l, "uday", 35000d);
		Employees e6 = new Employees(6l, "srinu", 19000d);
		ArrayList<Employees> employees = new ArrayList<Employees>();

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);

		Collections.sort(employees);
		for (Employees e : employees) {
			if (e.sal > 15000.0) {
				System.out.println(e.empId);
			}
		}
	}
}