package com.example.entity;

public class Course {
    private String courseCode;
    private String courseName;
    private Integer uniId;
    private String outlineInfo;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getUniId() {
        return uniId;
    }

    public void setUniId(Integer uniId) {
        this.uniId = uniId;
    }

    public String getOutlineInfo() {
        return outlineInfo;
    }

    public void setOutlineInfo(String outlineInfo) {
        this.outlineInfo = outlineInfo;
    }
}
