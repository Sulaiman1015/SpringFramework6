package com.sm.validation.byAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindException;
import org.springframework.validation.Validator;

@Service
public class MyValidatorTwo {
    @Autowired
    private Validator validator;

    public boolean validatorTow(User user){
        BindException bindException = new BindException(user,user.getUsername());
        validator.validate(user,bindException);
        return bindException.hasErrors();
    }
}
