package day_2.collections.task1;

import java.time.LocalDate;
import java.util.Map;

public class AttendanceStudent {
	
	int studentId;
	Map<LocalDate, Boolean> attendance;
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public Map<LocalDate, Boolean> getAttendance() {
		return attendance;
	}
	
	public void setAttendance(Map<LocalDate, Boolean> attendance) {
		this.attendance = attendance;
	}

	@Override
	public String toString() {
		return "AttendanceStudent [studentId=" + studentId + ", attendance=" + attendance + "]";
	}
	
}
