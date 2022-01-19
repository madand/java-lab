package com.epam.spring.homework1.other;

import com.epam.spring.homework1.beans.BeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanB {
    @Autowired
    public void setBeanB(BeanB beanB) {
        System.out.printf("%s. %s was injected trough the constructor.%n", getClass().getSimpleName(), beanB.getClass().getSimpleName());
    }
}
