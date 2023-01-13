import model.Classes;
import model.Student;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Student s1=new Student("Dhendup",18);
        Student s2=new Student("Jack",16);

        Student s3=new Student("Om",8);
        Student s4=new Student("Shreejesh",16);



        ArrayList<Student> Students1=new ArrayList<Student>();

        Students1.add(s1);
        Students1.add(s2);

        ArrayList<Student> Students2=new ArrayList<Student>();
        Students2.add(s3);
        Students2.add(s4);

        Classes c1=new Classes("Khumbilla",Students1);
        Classes c2=new Classes("Lobutse",Students2);
//        for (int i=0;i<Students.size();i++){
//            Student s=Students.get(i);
//            System.out.println(s.getName());
//        }

        for(Student s:Students1){
            System.out.println(s.getName());
        }



c1.getClassStudent();
    }
}
