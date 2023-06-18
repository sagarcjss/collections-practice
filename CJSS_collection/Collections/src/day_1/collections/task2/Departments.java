package day_1.collections.task2;

public class Departments {
	int deptId;
	String deptName;
	
	public int getDeptId() {
		return deptId;
	}
	
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	@Override
	public String toString() {
		return "Departments [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
}
