package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
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
        Movie movie= (Movie) applicationContext.getBean("movie");
        System.out.println("\n"+movie.getActorObject1().toString()+"\n");
//        System.out.println("Ecxeption thrown during 'Bytype' autowire");
//        try
//            {
//                Movie movie1= (Movie) applicationContext.getBean("movie1");
//            }
//        catch (Exception e)
//            {
//                System.out.println(e.toString());
//            }
        Movie movie1=(Movie) applicationContext.getBean("movie1");
        System.out.println("\n"+movie1.getActorObject1().toString()+"\n");


    }

}
