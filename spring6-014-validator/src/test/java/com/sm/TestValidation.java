package com.sm;

import com.sm.validation.byInterface.Person;
import com.sm.validation.byInterface.PersonValidator;
import com.sm.validation.byAnnotation.MyValidatorOne;
import com.sm.validation.byAnnotation.MyValidatorTwo;
import com.sm.validation.byAnnotation.User;
import com.sm.validation.byAnnotation.ValidationConfigAnno;
import com.sm.validation.byMethod.Client;
import com.sm.validation.byMethod.MyService;
import com.sm.validation.byMethod.ValidationConfigMethod;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

public class TestValidation {
    @Test
    public void clientValidationTest(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(ValidationConfigMethod.class);
        Client c = new Client();
        c.setName("");
        c.setAge(18);
        c.setPhone("06888888");

        MyService service = ac.getBean(MyService.class);
        String s = service.testMethod(c);

    }
    @Test
    public void userValidatorTwoTest(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(ValidationConfigAnno.class);

        User user = new User();
        user.setUsername("username");
        user.setPassword("");

        MyValidatorTwo myValidateTwo = ac.getBean("myValidatorTwo", MyValidatorTwo.class);
        boolean validatorTow = myValidateTwo.validatorTow(user);
        System.out.println(validatorTow);


    }

    @Test
    public void userValidatorOneTest(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(ValidationConfigAnno.class);

        User user = new User();
        user.setUsername("username");
        user.setPassword("password");

        MyValidatorOne myValidateOne = ac.getBean("myValidatorOne", MyValidatorOne.class);
        boolean validatorOne = myValidateOne.validatorOne(user);
        System.out.println(validatorOne);

    }

    @Test
    public void personValidatorTest(){
        Person p = new Person();
        p.setName("Jason");
        p.setAge(-34);

        DataBinder binder = new DataBinder(p);
        binder.setValidator(new PersonValidator());
        binder.validate();
        BindingResult result = binder.getBindingResult();
        System.out.println(result.getAllErrors());
    }
}
