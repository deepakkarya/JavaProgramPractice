package studentdatabaseapp;


import java.util.LinkedList;
import java.util.Scanner;

public class student {

	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private LinkedList<String> courses=new LinkedList<String>();
	private int tutionBalance=0;
	private static int costOfCource = 600;
	private static int id=10000;
	
	//Constructor : prompt user to enter name and year
public student() {
	
	Scanner in= new Scanner(System.in);
	System.out.println("Enter student first name: \n");
	this.firstName=in.nextLine();
	
	System.out.println("Enter student last name: \n");
	this.lastName=in.nextLine();
	
	System.out.println("1-Freshman \n2-Sophmore \n3-Junior \n4-SeniorEnter student Level: \n");
	this.gradeYear=in.nextLine();
	
	setStudentID();
	System.out.println("Student name and year are: "+firstName+" "+lastName+" "+gradeYear+" "+studentID);
	}
//generate an id
private void setStudentID() {
	id++;
	this.studentID= gradeYear +""+id;
}
	public void enroll() {
		
		do {
		System.out.println("Enter course to enroll (Q for quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if (!(course.equals("Q"))) {
			courses.add(course);
			tutionBalance = tutionBalance + costOfCource;
		}
		else {break;}
		}while(1!=0);
		System.out.println("Enrolled in: " + courses);
	}
	
	
	//enroll in courses
	
	//View balance
	
	public void viewBalance() {
		System.out.println("Tution balance is: $" + tutionBalance);
	}
	
	//pat tution
	
	public void payTution() {
		System.out.println("Enter your payment");
		Scanner in = new Scanner(System.in);
		int payment=in.nextInt();
		tutionBalance= tutionBalance-payment;
		System.out.println("Thank you for your payment: $" + payment);
		viewBalance();
		
	}
	
	//show status
	public String toString() {
		return "Name: "+firstName +" "+lastName+"\nCourses Enrolled:"+ courses+
				"\nBalance: $"+tutionBalance;
	}
}
