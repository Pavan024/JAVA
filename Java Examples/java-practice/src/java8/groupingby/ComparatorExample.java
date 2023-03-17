package java8.groupingby;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{  
    int rollNo;  
    String name;  
    int age;  
    Student(int rollno,String name,int age)
    {  
        this.rollNo=rollno;  
        this.name=name;  
        this.age=age;  
    }  
}

class AgeComparator implements Comparator<Student>
{  
    @Override
    public int compare(Student student1, Student student2) 
    {
        if(student1.age==student2.age)  
        return 0;  
        else if(student1.age>student2.age)  
        return 1;  
        else  
        return -1;  
    }  
}  

class RollNoComparator implements Comparator<Student>
{  
    @Override
    public int compare(Student student1, Student student2) 
    {
        if(student1.rollNo==student2.rollNo)  
        return 0;  //returns equals
        else if(student1.rollNo>student2.rollNo)  
        return 1;  //returns true
        else  
        return -1;  //returns false
    }  
}  

public class ComparatorExample
{  
    public static void main(String args[])
    {  
        ArrayList<Student> listOfStudent = new ArrayList<Student>();  
        listOfStudent.add(new Student(1,"Ravi",26));  
        listOfStudent.add(new Student(2,"kant",27));  
        listOfStudent.add(new Student(3,"kamboj",20));  
        
        // It Sorts all the objects based on Age 
        Collections.sort(listOfStudent, new AgeComparator());  
        for(Student student:listOfStudent)
        {  
            System.out.println("RollNo of Student = "+student.rollNo);
            System.out.println("Age of Student = "+student.age);
            System.out.println("Name of Student = "+student.name);
        }
        
        // It Sorts all the objects based on RollNo 
                Collections.sort(listOfStudent, new RollNoComparator());  
                for(Student student:listOfStudent)
                {  
                    System.out.println("RollNo of Student = "+student.rollNo);
                    System.out.println("Age of Student = "+student.age);
                    System.out.println("Name of Student = "+student.name);
                }
    }  
}  