package com.spring.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class App {
	public static void main( String[] args )
    {
    	ApplicationContext context =
    	   new ClassPathXmlApplicationContext("AppContext.xml");

    	Dept customerDAO = (Dept) context.getBean("dept");
        customerDAO.showDep();
        customerDAO.getEmp().show();

    }
}
