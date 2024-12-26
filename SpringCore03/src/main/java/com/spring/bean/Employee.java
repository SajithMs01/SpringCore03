package com.spring.bean;

public class Employee {

	private Integer id;
	private String name;
	private Double Salary;
	private String address;
	
	static
	{
		System.out.println("Employee class is loaded!");
	}
	
	
//	public Employee() {
//		super();
//		System.out.println("Employee bean is created!");
//	}


	public Employee(Integer id, String name, Double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		this.address = address;
		System.out.println("Param Employee Constructor");
	}
	
	public String employeetask()
	{
		return "Every employee acts productive but in reality all of them are less producive";
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + ", address=" + address + "]";
	}
	
	
	
	
}
