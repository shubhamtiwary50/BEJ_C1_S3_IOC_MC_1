package org.niit;

import org.niit.config.AppConfig;
import org.niit.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appcon=new AnnotationConfigApplicationContext(AppConfig.class);
        Employee emp1=appcon.getBean(Employee.class);
        System.out.println(emp1);
    }
}
