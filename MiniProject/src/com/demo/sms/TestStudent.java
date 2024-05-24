package com.demo.sms;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Student student=null;
		final int NUMBEROFDEPT=5;
		int studentId=100;
		String studentName;
		int age;
		int hoursPerWeek;
		Department dept[];
		int noOfDept;
		int deptId =1;
		int deptIndex =0;
		String deptName;
		int studentCount;
		int choice;
		String user,pwd;
		Scanner sc =new Scanner(System.in);
		do {
		System.out.println("*********WELCOME TO SMS**********");
		System.out.println("Enter your Username");
		user=sc.next();
		System.out.println("Enter Password");
	    pwd=sc.next();
	    
	    if(user.equals("admin")&& pwd.equals("1234")) {
	    	
	    	noOfDept=NUMBEROFDEPT;
	    	dept= new Department[noOfDept];
	    	do {
	    		System.out.println("Enter your choice");
	    		System.out.println("1.Add a Dept");
	    		System.out.println("2.Add a Student");
	    		System.out.println("3.Find the details of a student given thier Dept ID and student Id");
	    		System.out.println("4:Show all students of a Dept");
	    		System.out.println("5.show all Dept");
	    		choice = sc.nextInt();
	    		switch(choice) {
	    		case 1:
	    			if(deptIndex<noOfDept) {
	    				sc.nextLine();
	    				System.out.println("Enter the Dept name");
	    				deptName =sc.nextLine();
	    				System.out.println("Enter the total No of seats");
	    				studentCount=sc.nextInt();
	    				dept[deptIndex++]=new Department(deptId, deptName,studentCount);
	    				deptId++;
	    			}else {
	    				System.out.println("Cannot add anymore Dept");
	    			}	break;
	    		case 2:
	    			int dId;
	    			int dChoice;
	    			System.out.println("*****DEPARTMENTS*****");
	    		    for(Department dep: dept) {
	    		    	if(dep!=null) {
	    		    		dep.ShowDepartments();
	    		    	}
	    		    }
	    		    	
	    		    System.out.println("Enter the DEPT ID to which the student should be added");
	    		    dId=sc.nextInt();
	    		    System.out.println("Enter the student Details");
	    		    System.out.println("Enter the student Name");
	    		    studentName=sc.next();
	    		    System.out.println("Enter the student Age");
	    		    age= sc.nextInt();
	    		    System.out.println("If he/she is a  part-time student!! please enter 1 or enter 0");
	    		    dChoice=sc.nextInt();
	    		    if(dChoice==1) {
	    		    	System.out.println("Enter Hours per week he/she works");
	    		    	hoursPerWeek = sc.nextInt();
	    		     	student = new PartimeStudent(studentId, studentName,age, hoursPerWeek);
	    		    	
	    		    }else {
	    		    	student = new Student(studentId, studentName,age);
	    		    }studentId++;
	    		    for(int i=0;i<dept.length;i++) {
	    		    	if(dept[i]!=null && dId == dept[i].getId()) {
	    		    		dept[i].addStudent(student);
	    		    	}
	    		    }
	    		    break;
	    		case 3:
	    			int stuId,depId;
	    			System.out.println("Enter the Dept id and Student ID to find the details");
	    			depId =sc.nextInt();
	    			stuId=sc.nextInt();
	    			for(int i=0;i<dept.length;i++) {
	    				if(depId==dept[i].getId()) {
	    					dept[i].showStudent(stuId);
	    					break;
	    				}
	    			}
	    			break;
	    			
	    		case 4:
	    			int id;
	    			System.out.println("Enter Dept id");
	    			id=sc.nextInt();
	    			for(int i=0;i<dept.length;i++) {
	    				if(id==dept[i].getId()) {
	    					dept[i].showStudent();
	    					break;
	    				}
	    				
	    			}
	    			break;
	    		case 5:
	    			System.out.println("****DEPARTMENTS****");
	    			for(Department dep:dept)
	    				dep.ShowDepartments();
	    		}
	    		System.out.println("do you want to exit? 1==YES , 0==NO");
	    		choice= sc.nextInt();
	    		} while(choice==1);
	    
	    
	    }else {
	    	System.out.println("Invalid user_name!!! please try again!!!.");
	    	System.out.println("Do you want to continue? if yes  please enter 1");
		    choice = sc.nextInt();
		    
	    }
	    
		}
	while (choice==1);
   }
		
   
	
}
