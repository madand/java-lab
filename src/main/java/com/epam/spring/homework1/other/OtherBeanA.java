package com.epam.spring.homework1.other;

import com.epam.spring.homework1.beans.BeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanA {
    @Autowired
    public OtherBeanA(BeanA beanA) {
        System.out.printf("%s. %s was injected trough the constructor.%n", getClass().getSimpleName(), beanA.getClass().getSimpleName());
    }
}
