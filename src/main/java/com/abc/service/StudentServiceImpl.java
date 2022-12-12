package com.abc.service;

import com.abc.dao.StudentDao;
import com.abc.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alhagie Bai Cham
 * @date 12/12/22
 */

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentDao studentDao;

    @Override
    public boolean saveStudent(Student student) {

        return studentDao.saveStudent(student);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
