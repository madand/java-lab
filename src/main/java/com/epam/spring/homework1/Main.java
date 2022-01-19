package com.epam.spring.homework1;

import com.epam.spring.homework1.config.BeansConfig;
import com.epam.spring.homework1.pet.Cheetah;
import com.epam.spring.homework1.pet.Pet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);

        context.getBean(Pet.class).printPets();

        // This one should be a bean annotated @Primary
        final Cheetah byClass = context.getBean(Cheetah.class);
        System.out.println("byClass = " + byClass);

        final Cheetah byNameCheetah = context.getBean("cheetah", Cheetah.class);
        System.out.println("byNameCheetah = " + byNameCheetah);

        final Cheetah byNameCheetah1 = context.getBean("cheetah1", Cheetah.class);
        System.out.println("byNameCheetah1 = " + byNameCheetah1);

        final Cheetah byNameCheetah2 = context.getBean("cheetah2", Cheetah.class);
        System.out.println("byNameCheetah2 = " + byNameCheetah2);

        System.out.println("byClass == byNameCheetah1: " + (byClass == byNameCheetah1));
    }
}
