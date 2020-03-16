package by.htp.student.main;

import java.util.List;

public class View {
	
	public void print(Student[] students) {
		for (Student s : students) {
			System.out.println(s);
		}
	}
	
	public void printExcellentPupils(List<String> strings) {
		for (String s : strings) {
			System.out.println(s);
		}
	}

}
