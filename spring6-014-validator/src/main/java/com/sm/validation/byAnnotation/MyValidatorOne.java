package com.sm.validation.byAnnotation;


import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class MyValidatorOne {

    @Autowired
    private Validator validator;

    public boolean validatorOne(User user){
        Set<ConstraintViolation<User>> validate = validator.validate(user);
        return validate.isEmpty();

    }

}
