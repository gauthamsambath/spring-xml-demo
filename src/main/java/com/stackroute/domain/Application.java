package com.stackroute.domain;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.util.Arrays;

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
        Movie movie= (Movie) applicationContext.getBean("movie1");
        System.out.println("\n"+movie.getActor().toString()+"\n");
//        ApplicationContext applicationContext1= new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1= (Movie) applicationContext.getBean("movie1");
        System.out.println("\n"+movie1.getActor().toString()+"\n");
        System.out.println("Checking if both are the same objects with scope:prototype");
        System.out.println(movie1==movie);
        Movie movie2= (Movie) applicationContext.getBean("movie");
        System.out.println("\n"+movie.getActor().toString()+"\n");
//        ApplicationContext applicationContext1= new ClassPathXmlApplicationContext("beans.xml");
        Movie movie3= (Movie) applicationContext.getBean("movie");
        System.out.println("\n"+movie1.getActor().toString()+"\n");
        System.out.println("Checking if both are the same objects with scope:singleton");
        System.out.println(movie2==movie3);
        System.out.println("\n Demonstration of multiple ids 'movieA' and 'movieB' in the same movie bean \n");
        Movie movie4= (Movie) applicationContext.getBean("movieA");
        System.out.println("\n"+movie4.getActor().toString()+"\n");
        Movie movie5= (Movie) applicationContext.getBean("movieB");
        System.out.println("\n"+movie5.getActor().toString()+"\n");
    }

}
