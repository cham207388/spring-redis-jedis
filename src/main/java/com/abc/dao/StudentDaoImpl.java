package com.abc.dao;

import com.abc.entity.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Alhagie Bai Cham
 * @date 12/12/22
 */

@Slf4j
@Repository
@RequiredArgsConstructor
public class StudentDaoImpl implements StudentDao {

    private final RedisTemplate redisTemplate;

    @Override
    public boolean saveStudent(Student student) {
        try {
            redisTemplate.opsForHash().put("user", student.getId().toString(), student);
            return true;
        } catch (Exception ex) {
            log.error("Error saving student with id : {}\n--> {}", student.getId(), ex.getMessage());
            return false;
        }
    }

    @Override
    public List<Student> findAll() {
        try {
            return redisTemplate.opsForHash().values("user");
        } catch (Exception ex) {
            log.error("Error fetching user hash");
            return Collections.emptyList();
        }
    }
}
