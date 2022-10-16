package org.example;

import org.joda.time.*;

import java.util.ArrayList;

public class Student {

    //(Name, Age, DOB, ID,
    //username, courses and modules registered for, etc.).
    //A specific method (getUsername()) will generate the student’s username by
    //concatenating their name and age

    private String name;
    private String username;
    private int id;
    private int age;
    private DateTime DOB;

    private CourseProgramme course;
    private ArrayList<Module> modules;

    public Student(int id, String name, int age, DateTime DOB){
        this.id = id;
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.modules = new ArrayList<Module>();
        username = name + id;
    }

    public Student(){
        this.id = 1;
        this.name = "John Smith";
        this.age = 18;
        this.DOB = new DateTime(2002, 8, 8, 0, 0);
        this.modules = new ArrayList<Module>();
        this.username = name + id;
    }


    public String getUsername(){
        return username;
    }

    public String toString(){
        return "\nId: " + id + " Username: " + username + " Name: " + name + " Age: " + age;

    }

}