package org.example;
import org.joda.time.DateTime;
import java.util.ArrayList;
public class Lecturer {

    private String name = "";
    private int age = 0;
    private int id = 0;
    private String username;
    private DateTime DOB;
    private ArrayList moduleList;


    public Lecturer(int id, String name, int age, DateTime DOB){
        this.id = id;
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        username = name + "." + id;
        moduleList = new ArrayList<Module>();
    }
    public String getUsername(){
        return username;
    }

    public String toString(){
        return "Id: " + id + " Username: " + username + " Name: " + name + " Age: " + age;
    }

}
