package org.example;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CourseProgramme {
    //A course programme class containing course name (CS & IT or ECE, etc.), list of
    //modules, list of students that are enrolled, academic start date and end date.
    //Start and end dates should use Terasoluna Joda Time classes (i.e. DateTime), which
    //must be added as a project dependency (see

    private String courseName;
    private ArrayList modules;
    private ArrayList students;
    private DateTime startDate;
    private DateTime endDate;

    public CourseProgramme(String courseName, ArrayList<Module> modules, DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.modules = modules;
        this.students = new ArrayList<Student>();
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName(){
        return courseName;
    }
    public ArrayList getModules(){
        return modules;
    }
    public ArrayList getStudents(){
        return students;
    }
    public DateTime getStartDate(){
        return startDate;
    }
    public DateTime getEndDate(){
        return endDate;
    }



}
