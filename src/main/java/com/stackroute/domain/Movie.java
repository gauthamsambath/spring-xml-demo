package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Arrays;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware
    {
        private Actor actorObject1;
        private ApplicationContext context=null;
        private String beanName;
        private BeanFactory beanFactory=null;
        public Movie(Actor actorObject1) {
            this.actorObject1 = actorObject1;
            System.out.println("using parametrized constructor");
        }

        public Movie() {
        }

        public void setActorObject1(Actor actorObject1) {

            this.actorObject1 = actorObject1;
            System.out.println("\n Using Setter \n");
        }

        public Actor getActorObject1() {
            return actorObject1;
        }


        @Override
        public void setBeanFactory(BeanFactory beanFactory) throws BeansException
            {
                System.out.println("Bean factory is:-"+beanFactory.toString());
                this.beanFactory=beanFactory;
            }

        @Override
        public void setBeanName(String s)
            {
                System.out.println("Bean name is:-"+ Arrays.asList(s).toString());
                this.beanName=s;
            }

        @Override
        public void setApplicationContext(ApplicationContext Context) throws BeansException
            {
                System.out.println("Bean context is:-"+Context.toString());
                this.context=Context;
            }

        public ApplicationContext getContext() {
            return context;
        }

        public String getBeanName() {
            return beanName;
        }

        public BeanFactory getBeanFactory() {
            return beanFactory;
        }
    }
