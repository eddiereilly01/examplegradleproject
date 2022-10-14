package org.example;

import org.joda.time.*;
public class Student {

    //(Name, Age, DOB, ID,
    //username, courses and modules registered for, etc.).
    //A specific method (getUsername()) will generate the student’s username by
    //concatenating their name and age

    private String name = "";
    private int age = 0;
    private int id = 0;
    private String username;
    private String[] courses;
    private Module[] modules;
    private DateTime DOB;

    public Student(int id, String name, int age, DateTime DOB){
        this.id = id;
        this.name = name;
        this.age = age;
        this.DOB = DOB;

    }

    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getUsername(){
        username = name + "." + id;
        return username;
    }
    public String[] getCourse(){
        return courses;
    }
    public Module[] getModules(){
        return modules;
    }
    public DateTime getDOB(){
        return DOB;
    }

}