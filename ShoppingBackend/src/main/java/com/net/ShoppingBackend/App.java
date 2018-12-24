package com.net.ShoppingBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.net.ShoppingBackend.config.HibernateConfig;
import com.net.ShoppingBackend.model.Category;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
    	context.scan("com.net.ShoppingBackend");
    	context.refresh();
    	Category category=(Category)context.getBean("category");
    	
    	
    	
    	
    }
}
