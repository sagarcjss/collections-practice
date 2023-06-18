package day_2.collections.task1;

import java.util.Map;

public class Marks {
	
	int studentId;
	Map<Subjects, Integer> marks;
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public Map<Subjects, Integer> getMarks() {
		return marks;
	}
	
	public void setMarks(Map<Subjects, Integer> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Marks [studentId=" + studentId + ", marks=" + marks + "]";
	}
}