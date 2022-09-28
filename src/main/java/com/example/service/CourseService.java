package com.example.service;

import com.example.entity.Course;

import java.util.List;

public interface CourseService {
    Course getByCourseCode(String courseCode);
    List<Course> getAllCourses();
}
