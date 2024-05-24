package com.demo.sms;

public class Department {
	int deptId;
	String deptName;
	Student[] students;
	int count;

	public Department(int deptId, String deptName, int noOfSeat) {
		this.deptId = deptId;
		this.deptName = deptName;
		students = new Student[noOfSeat];
	}

	
	
	public void addStudent(Student student) {
		if (count < students.length) {
			students[count++] = student;

		} else {
			System.out.println("NO VACANCY");
		}
	}
	
	
	
	public void showStudent() {
		System.out.println("DEPT NAME:" + deptName);
		for(int i=0;i<count;i++) {
			students[i].findDetails();
		}
	}
	
	
	
	public void ShowDepartments() {
		System.out.println("ID:" + deptId +" "+ "NAME:" +deptName);
	}
	
	
	
	public int getId() {
		return deptId;
	}
	
	
	
	public void showStudent(int stuId) {
		for(int i=0;i<count;i++) {
			if(stuId== students[i].getId()) {
				students[i].findDetails();
				break;
			}
			else {
				System.out.println("No such student exists");
				
			}
	
		}
		
	}
	
	
	
	
}
