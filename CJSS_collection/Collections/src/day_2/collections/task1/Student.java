package day_2.collections.task1;

public class Student {
	
	int studentId;
	String studentName;
	String studentEmail;
	int year;
	Branch branch;
	AttendanceStudent attendance;
	Marks marks;
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentEmail() {
		return studentEmail;
	}
	
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public Branch getBranch() {
		return branch;
	}
	
	public void setBranchId(Branch branchId) {
		this.branch = branchId;
	}
	
	public AttendanceStudent getAttendance() {
		return attendance;
	}
	
	public void setAttendance(AttendanceStudent attendance) {
		this.attendance = attendance;
	}

	public Marks getMarks() {
		return marks;
	}

	public void setMarks(Marks marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", year=" + year + ", branch=" + branch + ", attendance=" + attendance + ", marks=" + marks + "]";
	}

	
	
}
