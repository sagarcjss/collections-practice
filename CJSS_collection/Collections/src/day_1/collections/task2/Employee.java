package day_1.collections.task2;

import java.util.List;

public class Employee {
	
	int employeeId;
    String employeeName;
    double salary;
    int locationId;
    int deptId;
    List<Integer> benefitId;
    
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getLocationId() {
		return locationId;
	}
	
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	public int getDeptId() {
		return deptId;
	}
	
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	public List<Integer> getBenefitId() {
		return benefitId;
	}
	
	public void setBenefitId(List<Integer> benefitId) {
		this.benefitId = benefitId;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", locationId=" + locationId + ", deptId=" + deptId + ", benefitId=" + benefitId + "]";
	} 
 }
