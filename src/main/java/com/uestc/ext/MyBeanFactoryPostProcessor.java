package com.uestc.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {


    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor---postProcessBeanFactory---");
        int count = beanFactory.getBeanDefinitionCount();
        String[] definitionNames = beanFactory.getBeanDefinitionNames();
        System.out.println("当前BeanFactory中有" + count + " 个Bean");
        System.out.println(Arrays.asList(definitionNames));
    }
}
