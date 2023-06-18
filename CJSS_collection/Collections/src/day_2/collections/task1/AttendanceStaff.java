package day_2.collections.task1;

import java.time.LocalDate;
import java.util.Map;

public class AttendanceStaff {
	
	int staffId;
	Map<LocalDate, Boolean> attendance;
	
	public int getStaffId() {
		return staffId;
	}
	
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public Map<LocalDate, Boolean> getAttendance() {
		return attendance;
	}

	public void setAttendance(Map<LocalDate, Boolean> attendance) {
		this.attendance = attendance;
	}

	@Override
	public String toString() {
		return "AttendanceStaff [staffId=" + staffId + ", attendance=" + attendance + "]";
	}
	
}
