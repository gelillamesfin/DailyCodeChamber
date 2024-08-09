package com.meInJava.practice_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
record Person(String name, int age , Address address){
}
record Address (String street ,String city, int zipcode){

}
@Configuration
public class HelloSpringConfig {
    @Bean
public String name (){
    return "Gelilla";
}
@Bean
public int age(){
    return 100;
}
@Bean 
@Primary
public Person person(){
    var person= new Person("Lulu",300, new Address("main st ","FairField",4123));
    
    return person;
}

@Bean
public Person person2() {
    var person = new Person(name(), age(),address());

    return person;
}
@Bean(name="address2")
public Address address(){
return  new Address("Here st ", "Dallas", 75081);
 
}

}
