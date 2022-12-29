package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.*;

import id.ac.undiksha.organization.*;

public class Main {

	public static void main(String[] args) {
//		Student std1 = new Student();
//		std1.setName("Jack Kahuna Lagoona");
//		std1.setAddress("Bikini Bottom");
//		System.out.print(std1.getAddress());
//		System.out.print(std1.getName());
//		std1.printAllInfo();

//		Student std2 = new Student("121134", "Lucky", "New York", true, "Computer Science", "Informatics", "FTK");
//		std2.printAllInfo();
//		Lecturer l2 = new Lecturer("19951206", "Lucky", "New York", true, "Computer Science", "Informatics", "FTK");
//		l2.printAllInfo();
//		Staff s2 = new Staff("19951206", "Lucky", "New York", true, "Language Unit");
//		s2.printAllInfo();
		
//		Person prs1 = new Person();
//		prs1.setName("Adi");
//		System.out.println(prs1.getName());
		
//		Student std1 = new Student();
//		std1.setNim("12345");
//		std1.printAllInfo();
		
//		Person siX = new Student();
//		siX.getName();
		
//		Person siY = new Person("Caca", "Denpasar", false);
//		Student siZ = new Student("12345", "ILKOM", "TI", "FTK");

		
		Student siA = new Student("Caca", "Denpasar", false, "12345", "ILKOM_Code", "Ilmu Komputer");
		siA.printAllInfo();
		siA.getStudyProgram().getStudyProgramCode();
	}

}
