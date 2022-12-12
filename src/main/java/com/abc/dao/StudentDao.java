package com.abc.dao;

import com.abc.entity.Student;

import java.util.List;

/**
 * @author Alhagie Bai Cham
 * @date 12/12/22
 */
public interface StudentDao {
    boolean saveStudent(Student student);

    List<Student> findAll();
}
