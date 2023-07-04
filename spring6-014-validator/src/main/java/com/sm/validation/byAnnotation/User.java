package com.sm.validation.byAnnotation;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
public class User {
    @NotNull
    @Size(max = 10,min = 4)
    private String username;
    @NotNull
    @Size(max = 20,min = 6)
    private String password;

    /**
     * get
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * set
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * get
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * set
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
