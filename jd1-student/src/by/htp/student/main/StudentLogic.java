package by.htp.student.main;

import java.util.ArrayList;
import java.util.List;

public class StudentLogic {
	
	public List<String> getExcellentPupils(Student[] students) {
		List<String> result = new ArrayList<String>();
		for (Student s : students) {
			int[] array = s.getPerformance();
			boolean b = true;
			
			for (int i : array) {
				if (i < 9) {
					b = false;
				}
			}
			
			if (b) {
				result.add(toStringSurnameAndGroupNumber(s));
			}
		}
		return result;
	}
	
	private String toStringSurnameAndGroupNumber(Student student) {
		return student.getSurname() + " " + student.getGroupNumber();
	}

}
