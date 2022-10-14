package org.example;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class Lecturer {

    private String name = "";
    private int age = 0;
    private int id = 0;
    private String username;
    private ArrayList modulesLecturing;
    private DateTime DOB;

    public Lecturer(int id, String name, int age, DateTime DOB){
        this.id = id;
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        modulesLecturing = new ArrayList<Module>();

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

    public ArrayList getModules(){
        return modulesLecturing;
    }
    public DateTime getDOB(){
        return DOB;
    }



}
