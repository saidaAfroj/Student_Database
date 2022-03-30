package studentdatabase;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

       // Student stu = new Student();
        //Ask how many student to add
        System.out.println("Enter number of new student to enroll :");
        Scanner in = new Scanner(System.in);
        int numOfstudent = in.nextInt();
        student[] students = new student[numOfstudent];// creating array of object of that class student.
        // so name should be same as "student.java" class
        for( int i = 0; i <numOfstudent ;i++)
        {
            students[i] = new student();
            students[i].enroll();
            students[i].paytution();


        }
        for(int j = 0;j<numOfstudent;j++){
            System.out.println(students[j].toString());
        }

    }
}