package studentdatabaseapp;

import java.util.Scanner;

public class studentdatabaseapp {

	public static void main(String[] args) {
		
		
		//Ask how many students to add;
		
		System.out.println("Enter the number of students to add...");
		Scanner in = new Scanner(System.in);
		int numberOfStudents=in.nextInt();
		student[] students=new student[numberOfStudents];
				for (int n=0;n<numberOfStudents;n++) {
			students[n] = new student();
			students[n].enroll();
			students[n].payTution();
		
		}
				for (int n=0;n<numberOfStudents;n++) {
					System.out.println("Student details are....");
					System.out.println(students[n].toString());
				}
				
		
		
	}

}
