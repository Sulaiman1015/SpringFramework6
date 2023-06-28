package fr.sm.service;

import fr.sm.dao.StudentDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Resource(name = "studentImplOracle")
    private StudentDao studentDao;

    //@Resource
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void deleteStudent(){
        studentDao.deleteById();
    }
}
