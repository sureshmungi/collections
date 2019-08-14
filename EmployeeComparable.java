package capgemini.collections;

import java.util.Arrays;

import java.util.ArrayList;

class Employee implements Comparable<Employee> {
	// field..
	private int empId;
	private String name;

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	
	public int getEmpId() {
		return empId;
	}


	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return String.format("Employee [empId=%s, name=%s]", empId, name);
	}

	@Override
	public int compareTo(Employee otherEmployee) {
		if (this.empId == otherEmployee.getEmpId())
			return 0;
		else if (this.empId > otherEmployee.empId)
			return 1;
		else
			return -1;
	}

}

public class EmployeeComparable {
	public static void main(String[] args) {

		Employee e1, e2, e3;
		e1 = new Employee(1, "me");
		e2 = new Employee(2, "notme");
		e3 = new Employee(3, "byme");
		Employee[] emps = { e1, e2, e3 };
		// java.lang.ClassCastException: capgemini.collection.Employee cannot be
		// cast to java.lang.Comparable
		Arrays.sort(emps);
		System.out.println("Array sorted via Array.sort:" + Arrays.toString(emps));
		System.out.println(e1.compareTo(e2));
		

	}
}
