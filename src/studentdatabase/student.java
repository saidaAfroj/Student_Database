package studentdatabase;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class student {

  // encapsulate all the properties :
    private String firstname;
    private String lastname;
    private int gradeYear;
    private String  studentid;
    private String courses= null;
    private int tutionBalance= 0;
    private static  int costofcourse = 600;
    private static int id =1001;




    //here we need a constructor . prompts user to enter student name and year

    public student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student's firstname :");
        this.firstname = in.nextLine();
        System.out.println("Enter Student's lastname : ");
        this.lastname= in.nextLine();
        System.out.println("\n1.Freshman\n 2.Sophomore \n 3.Junior \n 4.Senioe \n Enter Student's Class level : ");
        this.gradeYear = in.nextInt();

        setStudentID();//call the method to set the unique id .
        System.out.println("Firstname : "+firstname +"\nLastname :"+lastname+"\nGrade year : " +gradeYear + "\n"+
                studentid);


    }

    //now generate an id according to the features list. it should be private and handle internally

    private  void setStudentID ( ){
        id++;// increment id every time insert a new student .
        //making uniqe id with grade level  + id
        this.studentid= gradeYear + "" +id;


    }

    //next feature Enroll in courses
    public void enroll(){
      //get into a loop to keep adding courses / till press quit
        do {
            System.out.println("Enter a course to enroll (if enroll press 1 or press q ) : ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("q")) {
                courses = courses + "\n" + course;
                tutionBalance = tutionBalance + costofcourse;// while adding each course 600$ will be added. so increase the tution
                //balance

            }
            else {
                break;
            }

        }while ( 1 != 0);

        }

    //view balance
    public  void viewbalance(){
        System.out.println("Name :" + firstname +" "+ lastname +"'s balance is :" + "$" +tutionBalance +"\n");
    }

    //pay tution
    public void paytution (){
        System.out.println("Enter how much you want to pay $:\n");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        tutionBalance = tutionBalance - payment;
        System.out.println("Thank you for payment . we received :" +"$"+payment +" now your total balance is: "+"$"+tutionBalance +"\n" );
        viewbalance();
    }


    // show all information
    public String toString(){

        return "Firstname :" +" " +firstname + " "+ "Lastname :" +lastname + "\n"
                +"grade Level : " +gradeYear +"\n"
                +"Student Id :"   +studentid +"\n"
                +"Courses enrolled :" + courses + "\nTotal tution Balance :" +"$"+tutionBalance;

    }
}
