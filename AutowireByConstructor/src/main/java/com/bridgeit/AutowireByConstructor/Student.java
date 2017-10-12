package com.bridgeit.AutowireByConstructor;

public class Student {

	private College collage;

	public Student(College collage) {
		this.collage = collage;
	}

	@Override
	public String toString() {
		return "Student [collage=" + collage + "]";
	}
	
	
}
