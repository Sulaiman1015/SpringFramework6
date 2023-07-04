package com.sm.validation.byMethod;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class MyService {
    public String testMethod(@Valid @NotNull Client client){
        return client.toString();
    }
}
