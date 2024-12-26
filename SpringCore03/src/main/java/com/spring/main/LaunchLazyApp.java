package com.spring.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.spring.bean.Employee;

public class LaunchLazyApp {
	
	public static void main(String[] args) 
	
	{
	
//		Resource resource = new ClassPathResource("applicationcontext.xml");
//		BeanFactory container= new XmlBeanFactory(resource );
		 
		DefaultListableBeanFactory container = new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader read = new XmlBeanDefinitionReader(container);
		
		read.loadBeanDefinitions("applicationcontext.xml");
		read.loadBeanDefinitions("applicationcontext2.xml");
		
		
		
		Employee empBean1 = container.getBean("emp1", Employee.class);
//		String task1 = empBean1.employeetask();
//		System.out.println(task1);
		System.out.println(empBean1);
	
		Employee empBean2 = container.getBean("emp2", Employee.class);
//		String task2 = empBean2.employeetask();
//		System.out.println(task2);
		System.out.println(empBean2);
	}

}
