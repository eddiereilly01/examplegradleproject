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
    private ArrayList moduleList;
    private ArrayList studentList;
    private DateTime startDate;
    private DateTime endDate;

    public CourseProgramme(String courseName, DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        studentList = new ArrayList<Student>();
        moduleList = new ArrayList<Module>();

    }

   public void addStudent( Student student){

        studentList.add(student);
   }

   public void addModule(Module module){
        moduleList.add(module);
   }

   public String toString(){
        return "Course: " + courseName + " \n" + "Start: " + startDate + "\n" + "End: " + endDate + "\n" + "Modules: " + moduleList.toString() + "\n" + "Students: " + "\n" + studentList.toString();
   }

}
