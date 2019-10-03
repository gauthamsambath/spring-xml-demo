package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemo implements InitializingBean, DisposableBean
    {

        @Override
        public void destroy() throws Exception
            {
                System.out.println("Destroying the bean");
            }

        @Override
        public void afterPropertiesSet() throws Exception
            {
                System.out.println("Properties are set");
            }
        public void customInit()
            {
                System.out.println("Before initializing object");
            }
        public void customDestroy()
            {
                System.out.println("After Destruction of bean");
            }
    }
