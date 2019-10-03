package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Application
{
    public static void main( String[] args )
    {
        System.out.println("\n"+"using Application context"+"\n");
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans.xml");
//        Movie movie= (Movie) applicationContext.getBean("movie");
//        System.out.println("\n"+movie.getActorObject1().toString()+"\n");
        ((AbstractApplicationContext)applicationContext).registerShutdownHook();
        BeanLifeCycleDemo beanLifeCycleDemo= (BeanLifeCycleDemo) applicationContext.getBean("beanlifecycledemo");


    }

}
