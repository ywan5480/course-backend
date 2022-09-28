package com.example.service.impl;

import com.example.entity.Course;
import com.example.mapper.CourseMapper;
import com.example.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseMapper courseMapper;

    @Override
    public Course getByCourseCode(String courseCode) {
        return courseMapper.selectByCourseCode(courseCode);
    }

    @Override
    public List<Course> getAllCourses() {
        return null;
    }
}
