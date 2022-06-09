package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Displays Student Name");
	}
	
	public void studentDept() {
		System.out.println("Displays Student Dept");
	}
	
	public void studentId() {
		System.out.println("Displays student ID");
	}

	public static void main(String[] args) {
		Student me = new Student();
		me.collegeName();
		me.collegeRank();
		me.collegeCode();
		me.deptName();
		me.studentId();
		me.studentName();
		me.studentDept();
	}
}
