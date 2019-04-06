package com.example.myapplication_json_practice.Modal;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {

    private String sid;
    private String sname;
    private String gender;
    private ArrayList<Student> studentArrayList;
    public Student(String sid, String sname, String gender) {
        this.sid = sid;
        this.sname = sname;
        this.gender = gender;
    }

    public Student()
    {
        this.sid ="";
        this.sname =  "";
        this.gender = "";
        studentArrayList = new ArrayList<>();
    }
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStudentArrayList(ArrayList<Student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }
}
