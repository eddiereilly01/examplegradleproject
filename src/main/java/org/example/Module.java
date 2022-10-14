package org.example;

import java.util.ArrayList;

public class Module {
  //  A module class, which should contain information such as module name, id (e.g.
    //        CT417), list of students, courses it is associated with, and lecturer responsible)
    private String name;
    private int id;
    private ArrayList students;
    private String lecturer;

    public Module(String name, int id, String lecturer){
        this.name = name;
        this.id = id;
        this.students =  new ArrayList<Student>();
        this.lecturer = lecturer;

    }

    public String name(){
        return name;
    }
    public int id(){
        return id;
    }
    public ArrayList students(){
        return students;
    }
    public String lecturer(){
        return lecturer;
    }
    public void addStudent(Student student){
        students.add(student);
    }

}
