package com.example.controller;

import com.example.entity.Course;
import com.example.mapper.CourseMapper;
import com.example.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping(value = "/{code}")
    public Course getCourseByCourseCode(@PathVariable("code") String code){
        return courseService.getByCourseCode(code);
    }
}
