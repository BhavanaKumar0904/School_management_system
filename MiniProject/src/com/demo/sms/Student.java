package com.demo.sms;

public class Student {
	 int studentId;
	 String studentName;
	 int age;
	 
	 public Student(int studentId, String studentName, int age) {
		 this.studentId = studentId;
		 this.studentName = studentName;
		 this.age =age;
		 
	 }
	 public void findDetails() {
		 System.out.println();
		 System.out.println("id: " +studentId+" "+ "Name: " + studentName + " "+"age: " +age);
		 System.out.println();
	 }
	 public int getId() {
		 return studentId;
	 }
	}