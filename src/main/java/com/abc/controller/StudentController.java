package com.abc.controller;

import com.abc.entity.Student;
import com.abc.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Alhagie Bai Cham
 * @date 12/12/22
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/student")
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<String> saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student)
                ? ResponseEntity.ok("Successfully saved a student!")
                : ResponseEntity.badRequest().build();
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAll() {
        return ResponseEntity.ok(studentService.findAll());
    }
}
