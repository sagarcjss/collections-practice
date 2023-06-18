package day_2.collections.task1;

import java.util.List;

public class Staff {
	
	int staffId;
	String staffName;
	String staffEmail;
	List<Subjects> subjects;
	AttendanceStaff attendance;
	
	public int getStaffId() {
		return staffId;
	}
	
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	
	public String getStaffName() {
		return staffName;
	}
	
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	
	public String getStaffEmail() {
		return staffEmail;
	}
	
	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}
	
	public List<Subjects> getSubjects() {
		return subjects;
	}
	
	public void setSubjectId(List<Subjects> subjectId) {
		this.subjects = subjectId;
	}
	
	public AttendanceStaff getAttendance() {
		return attendance;
	}
	
	public void setAttendance(AttendanceStaff attendance) {
		this.attendance = attendance;
	}

	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffName=" + staffName + ", staffEmail=" + staffEmail + ", subjectId="
				+ subjects + ", attendance=" + attendance + "]";
	}
	
}
