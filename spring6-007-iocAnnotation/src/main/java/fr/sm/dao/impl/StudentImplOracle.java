package fr.sm.dao.impl;

import fr.sm.dao.StudentDao;
import org.springframework.stereotype.Repository;

@Repository
public class StudentImplOracle implements StudentDao {
    @Override
    public void deleteById() {
        System.out.println("delete student by id in Oracle");
    }
}
