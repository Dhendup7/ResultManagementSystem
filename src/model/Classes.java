package model;

import java.util.ArrayList;

public class Classes {
    String class_name;
    ArrayList<Student> Students;

    public Classes(String class_name, ArrayList<Student> students) {
        this.class_name = class_name;
        Students = students;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public ArrayList<Student> getStudents() {
        return Students;
    }

    public void setStudents(ArrayList<Student> students) {
        Students = students;
    }




    public void getClassStudent() {
        ArrayList<Student>students=this.Students;
    for (Student s : Students) {
            System.out.println(s.getAge());
        }


    }
}



