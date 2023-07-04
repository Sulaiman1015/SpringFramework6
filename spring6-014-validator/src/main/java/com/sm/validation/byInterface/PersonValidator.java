package com.sm.validation.byInterface;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        //name not be null
        ValidationUtils.rejectIfEmpty(errors,"name","name.error.null","name is null");

        //0<age<150
        Person p = (Person) target;
        if(p.getAge()<0){
            errors.rejectValue("age","name.error.small","age less than zero ");
        }else if (p.getAge()>150){
            errors.rejectValue("age","name.error.big","age more than 150 ");
        }

    }
}
