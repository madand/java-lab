package com.epam.spring.homework1.config;

import com.epam.spring.homework1.pet.Cheetah;
import com.epam.spring.homework1.pet.Dog;
import com.epam.spring.homework1.pet.Spider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(
        basePackageClasses = Dog.class,
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ASSIGNABLE_TYPE,
                classes = Spider.class
        )
)
public class PetConfig {
        @Bean
        @Primary
        public Cheetah cheetah1() {
                return new Cheetah();
        }

        @Bean
        @Qualifier("myCheetah")
        public Cheetah cheetah2() {
                return new Cheetah();
        }
}
