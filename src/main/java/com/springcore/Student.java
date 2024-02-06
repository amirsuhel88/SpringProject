package com.springcore;

import java.security.PublicKey;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    public int getStudentId(int studentId){
        return studentId;
    }

    public void setStudentId(int studentId){
        System.out.println("Setting student ID");
        this.studentId = studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        System.out.println("Setting student Name");
        this.studentName = studentName;
    }
    public String getStudentAddress(){
        return studentAddress;
    }
    public void setStudentAddress(String studentAddress){
        System.out.println("Setting student Address");

        this.studentAddress = studentAddress;
    }
    public Student(int studentId, String studentName, String StudentAddress){
        super();
        this.studentId= studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }
    public Student(){
        super();
    }
    @Override
    public String toString(){
        return "Student [studentId="+studentId+",studentName="+studentName+",studentAddress="+studentAddress+"]";
    }
}
