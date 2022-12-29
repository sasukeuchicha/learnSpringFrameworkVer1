package com.springcore;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        context = new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) context.getBean("Student1");
        
        System.out.println(student1);

        
    }
}
