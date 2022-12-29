package id.ac.undiksha.siak.entities;

import id.ac.undiksha.organization.*;

public class Student extends Person {
	private String nim;
	private StudyProgram studyProgram;
//	private String studyProgram;
//	private String department;
//	private String faculty;

	public Student() {
		super();
		this.nim = "<Invalid nim>";
		studyProgram = new StudyProgram();
	}

//	
	public void printAllInfo() {
		System.out.println("\n Biodata Student \n");
		System.out.println("NIM : " + this.getNim());
		System.out.println("Name : " + this.getName());
		System.out.println("Address : " + this.getAddress());
		System.out.println("Study Program Code " + this.getStudyProgram().getStudyProgramCode());
		System.out.println("Gender : " + (getGender() ? "Male" : "Female"));
	}

	public Student(String name, String address, boolean gender, String nim, String studyProgramCode, String studyProgramName) {
		super(name, address, gender);
		this.nim = nim;
		studyProgram = new StudyProgram(studyProgramCode, studyProgramName);
		// TODO Auto-generated constructor stub
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNim() {
		return nim;
	}

	public StudyProgram getStudyProgram() {
		return studyProgram;
	}

	public void setStudyProgram(StudyProgram studyProgram) {
		this.studyProgram = studyProgram;
	}

}
