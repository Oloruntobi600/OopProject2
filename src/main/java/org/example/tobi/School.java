package org.example.tobi;

import java.util.*;

public class School {
    private int studentId;
    private List<String> courseList;
    private String teacher;



    public School (int studentId, List<String> courseList, String teacher){
        this.studentId = studentId;
        this.courseList = courseList;
        this.teacher = teacher;
    }
    public int getStudentId(){
        return studentId;
    }
    public List<String> getCourseList() {
        return courseList;
    }
    public String getTeacher(){
        return teacher;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }
    public void setTeacher(String teacher){
        this.teacher = teacher;
    }

    public List<Object> registerStudents (int studentId, List<String> courseList, String teacher){
        //Map <key, value> name = new Hashmap<>();
        Map<String, String>  studentInfo = new HashMap<>();
        studentInfo.put("studentId", String.valueOf(studentId));
        studentInfo.put("courseList", courseList.toString());
        studentInfo.put("teacher", teacher);

        List<Object> registeredStudentList = new ArrayList<>();
        registeredStudentList.add(studentInfo);

        return registeredStudentList;
    }


}

