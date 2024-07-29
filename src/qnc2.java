import java.util.*;
class Student{
    String name;
    int studentId,age;
    double grade;
    public void set(int a,String b,int c,double d){
        this.studentId=a;
        this.name=b;
        this.age=c;
        this.grade=d;
    }
    public void get(){
        System.out.println("Details of Student:-");
        System.out.println("StudentId: "+this.studentId);
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Grade: "+this.grade);
    }
}
public class qnc2
{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.set(474,"Vijay",21,92.8);
        s1.get();
        Student s2=new Student();
        s2.set(653,"Ram",20,88);
        s2.get();
    }
}