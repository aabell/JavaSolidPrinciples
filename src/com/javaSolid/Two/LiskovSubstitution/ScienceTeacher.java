package com.javaSolid.Two.LiskovSubstitution;

public class ScienceTeacher extends SchoolStaff implements CourseInstructor{

	@Override
	public void teach() {
		System.out.println("taught science");
	}
	
}
