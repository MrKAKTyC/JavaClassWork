package EmployeePackage;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	
	private String name;
	private double salary;
	private Date hireDay;
	private int id;
	static private int count = 1;
	
	public Employee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		this.hireDay = calendar.getTime();
		id=count++;
	}
	
	public String GetName() {
		return name;
	}
	public double GetSalary() {
		return salary;
	}
	public Date GetHireDate() {
		return hireDay;
	}
	public void raiseSalary(double byPercent) {
		double raise = salary*(byPercent / 100);
		salary += raise;
	}
	public int GetId() {
		return id;
	}
	@Override
	public String toString() {
		return "Hi my name is "+ this.name + " And my salary - "+ salary;
	}
	

}
