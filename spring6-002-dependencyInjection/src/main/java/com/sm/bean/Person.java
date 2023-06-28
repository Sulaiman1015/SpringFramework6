package com.sm.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
    //injection list
    private List<String> names;

    //injection set
    private Set<String> addrs;

    //injection map
    private Map<String,Integer> contact;

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setAddrs(Set<String> addrs) {
        this.addrs = addrs;
    }

    public void setContact(Map<String, Integer> contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + names +
                ", addrs=" + addrs +
                ", contact=" + contact +
                '}';
    }
}
