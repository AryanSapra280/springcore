package org.example;

import org.example.autowiring.autowiringUsingAnnotation.University;
import org.example.autowiring.autowiringUsingXml.Address;
import org.example.autowiring.autowiringUsingXml.Employee;
import org.example.componentAnnotation.College;
import org.example.constructorInjection.Person;
import org.example.lifeCycle.PepsiWithInterface;
import org.example.lifeCycle.PizzaWithAnnotation;
import org.example.lifeCycle.Samosa;
import org.example.setterInjection.Student;
import org.example.setterInjection.Traveller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Traveller traveller = (Traveller) context.getBean("Traveller1");
        System.out.println(traveller.toString());
        Student student = (Student) context.getBean("student1");
        System.out.println(student.toString());

        System.out.println("Printing object which was injected through constructor injection");
        Person person = (Person) context.getBean("person1");
        System.out.println(person.toString());

        //AbstractApplicationContext interface is used because this interface has registerShutdownHook() method
        AbstractApplicationContext abstractContext = new ClassPathXmlApplicationContext("config.xml");
        System.out.println("IoC container will call the init for Samosa bean");
        Samosa samosa = (Samosa) abstractContext.getBean("samosa");
        System.out.println(samosa);
        abstractContext.registerShutdownHook();//will be used to tell IoC that you need to call destroy method.

        PepsiWithInterface pepsi = (PepsiWithInterface) abstractContext.getBean("pepsi");
        System.out.println(pepsi.toString());

        PizzaWithAnnotation pizza = (PizzaWithAnnotation) abstractContext.getBean("pizza");
        System.out.println(pizza.toString());
        abstractContext.registerShutdownHook();

        System.out.println("Autowiring");
        Address address = (Address) abstractContext.getBean("address");
        System.out.println(address);
//        Employee employee = (Employee) abstractContext.getBean("employee");
        Employee employee = abstractContext.getBean("employee",Employee.class);
        System.out.println(employee.toString());

        University university = abstractContext.getBean("university",University.class);
        System.out.println(university);


        //bean created using @Component
        College college = abstractContext.getBean("college", College.class);
        System.out.println(college);

    }
}
