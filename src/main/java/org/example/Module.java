package org.example;

import java.util.ArrayList;

public class Module {

    private int id;
    private String name;
    private ArrayList studentList;
    private Lecturer lecturer;



    public Module(int id, String name, Lecturer lecturer){
        this.id = id;
        this.name = name;
        this.studentList =  new ArrayList<Student>();
        this.lecturer = lecturer;
    }


    public void addStudent(Student student){
        studentList.add(student);
    }

    public String toString(){
        return "\nId: " + id + " Name: "+ name + "\nLecturer: " + this.lecturer.toString();
    }
}
