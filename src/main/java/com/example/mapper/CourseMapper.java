package com.example.mapper;

import com.example.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseMapper {
    List<Course> selectAll();
    Course selectByCourseCode(String courseCode);
}
