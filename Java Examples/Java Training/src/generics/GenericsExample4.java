package generics;

class Employee {
	private Integer id;
	private String name;
	private Double salary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
	}
}

public class GenericsExample4 {
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setId(101);
		employee1.setName("Name1");
		employee1.setSalary(500000.00);
		Employee employee2 = new Employee();
		employee2.setId(102);
		employee2.setName("Name2");
		employee2.setSalary(400000.00);
		Employee empArry[] = new Employee[2];
		empArry[0] = employee1;
		empArry[1] = employee2;
		display(empArry);

		Integer[] intArray = { 10, 20, 30, 40, 50 };
		display(intArray);
	}

// Generic method 
	private static <E> void display(E[] elements) {
		for (E e : elements) {
			System.out.println(e);
		}
	}
}