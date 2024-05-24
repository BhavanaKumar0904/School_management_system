package com.demo.sms;

public class PartimeStudent extends Student {
	int hoursPerWeek;
	
	public PartimeStudent(int studentId, String studentName, int age, int hoursPerWeek) {
		super(studentId, studentName, age);
		this.hoursPerWeek= hoursPerWeek;
	}
	public void findDetails()
	{
		super.findDetails();
		System.out.println("Hours per week :" + hoursPerWeek);
		System.out.println();
	}
}
