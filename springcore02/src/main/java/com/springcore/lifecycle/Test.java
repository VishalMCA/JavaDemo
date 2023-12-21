package com.springcore.lifecycle;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/Configlife.xml");
		Samosa temp=(Samosa) context.getBean("s1");
        System.out.println(temp);
        context.registerShutdownHook();
        
        Pepsi p1=(Pepsi) context.getBean("p1");
        System.out.println(p1);
	
	
        Example e1= (Example) context.getBean("e1");
        System.out.println(e1);
	}
}
