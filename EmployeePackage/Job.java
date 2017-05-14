package EmployeePackage;

import java.util.Date;

public class Job {

	public static void main(String[] args) {
		Employee[] staff = new Employee[4];
		for(int i = 0; i<staff.length;i++)
		{
			staff[i]= new Employee("Emplo"+i, 5000, 2017, 3, 3);
		}
		for(Employee emp : staff) {
			System.out.println(emp.toString());
			emp.raiseSalary(5);
			System.out.println(emp.toString());
		}

	}

}
