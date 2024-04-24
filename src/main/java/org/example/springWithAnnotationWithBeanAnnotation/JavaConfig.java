package org.example.springWithAnnotationWithBeanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.script.ScriptEngineManager;

@Configuration
public class JavaConfig {

    @Bean
    public Student getStudent() {
        Student student = new Student("Aryan");
        return student;
    }
    @Bean
    public Samosa getSamosa() {
        Samosa samosa = new Samosa();
        samosa.setPrice(10);
        return samosa;
    }
}
