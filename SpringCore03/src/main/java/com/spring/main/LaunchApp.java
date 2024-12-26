package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Employee;

public class LaunchApp {

	public static void main(String[] args) 
	
	{
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationcontext.xml");

		Employee empBean1 = container.getBean("emp1", Employee.class);
		String task1 = empBean1.employeetask();
		System.out.println(task1);
		System.out.println(empBean1);
		
		Employee empBean2 = container.getBean("emp2", Employee.class);
		String task2 = empBean2.employeetask();
		System.out.println(task2);
		System.out.println(empBean2);
		
	}

}
