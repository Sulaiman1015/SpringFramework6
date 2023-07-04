package com.sm.validation.byMethod;

import jakarta.validation.constraints.*;

public class Client {
    @NotNull(message = "Name could not be null")
    private String name;

    @Min(value = 0,message = "less zero not allow")
    @Max(value = 150,message = "more 150 not allow")
    private int age;

    @Pattern(regexp = "^0(6|7)[0-9]{8}$",message = "Wrong number")
    @NotBlank(message = "Phone number could not be null")
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
