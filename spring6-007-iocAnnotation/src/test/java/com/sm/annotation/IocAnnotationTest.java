package com.sm.annotation;

import com.sm.ioc.beans.Director;
import com.sm.ioc.beans.School;
import com.sm.ioc.beans.Student;
import com.sm.ioc.beans.Teacher;
import com.sm.ioc.beans2.MyDataSource;
import com.sm.reflect.bean.User;
import fr.sm.Spring6Config;
import fr.sm.service.StudentService;
import org.junit.Test;
import org.sm.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocAnnotationTest {
    @Test
    public void testNoXML(){
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(Spring6Config.class);
        StudentService studentService = acac.getBean("studentService", StudentService.class);
        studentService.deleteStudent();
    }

    @Test
    public void testAutowired(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-autowired.xml");
        OrderService orderService = ac.getBean("orderService", OrderService.class);
        orderService.generateOrder();
    }

    @Test
    public void testResourceAnnotation(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-resource.xml");
        StudentService studentService = ac.getBean("studentService", StudentService.class);
        studentService.deleteStudent();
    }

    @Test
    public void testDIAnnotation(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("di-annotation.xml");
        MyDataSource myDataSource = ac.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
    }

    @Test
    public void testBeanChoose(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

    }
    @Test
    public void testBeanComponent(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Director directorBean = ac.getBean("directorBean", Director.class);
        System.out.println(directorBean);
        School schoolBean = ac.getBean("schoolBean", School.class);
        System.out.println(schoolBean);
        Teacher teacherBean = ac.getBean("teacherBean", Teacher.class);
        System.out.println(teacherBean);
        Student studentBean = ac.getBean("studentBean", Student.class);
        System.out.println(studentBean);


    }
}
