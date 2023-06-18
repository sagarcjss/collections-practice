package day_1.collections.task2;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		Departments dept1 = new Departments();
		dept1.setDeptId(1001);
		dept1.setDeptName("healthcare");
		
		Departments dept2 = new Departments();
		dept2.setDeptId(1002);
		dept2.setDeptName("finance");
		
		Departments dept3 = new Departments();
		dept3.setDeptId(1003);
		dept3.setDeptName("admin");
		
		Departments dept4 = new Departments();
		dept4.setDeptId(1004);
		dept4.setDeptName("fraud");
		
		List<Departments> deptList = new ArrayList<>();
		deptList.add(dept1);
		deptList.add(dept2);
		deptList.add(dept3);
		deptList.add(dept4);
		
		Locations loc1 = new Locations();
		loc1.setLocationId(101);
		loc1.setLocationName("hyderabad");
		loc1.setLocationCountry("india");
		
		Locations loc2 = new Locations();
		loc2.setLocationId(102);
		loc2.setLocationName("chennai");
		loc2.setLocationCountry("india");
		
		Locations loc3 = new Locations();
		loc3.setLocationId(103);
		loc3.setLocationName("london");
		loc3.setLocationCountry("united kingdom");
		
		List<Locations> locList = new ArrayList<>();
		locList.add(loc1);
		locList.add(loc2);
		locList.add(loc3);
		
		Benefits benefits1 = new Benefits();
		benefits1.setBenefitId(100001);
		benefits1.setBenefitName("health insurance");
		benefits1.setDescription("Employee health insurance is a benefit extended by individual's "
				+ "employer to their employees. it does not only cover the persons working for the employer but also "
				+ "covers the rest of family member under the policy.");
		
		Benefits benefits2 = new Benefits();
		benefits2.setBenefitId(100002);
		benefits2.setBenefitName("pf");
		benefits2.setDescription("it is a retirement benefit scheme where, both the employer and the employee, contribute a "
				+ "certain sum every month till the employee is working");
		
		Benefits benefits3 = new Benefits();
		benefits3.setBenefitId(100003);
		benefits3.setBenefitName("gratuity");
		benefits3.setDescription("Gratuity is an amount paid by an employer to its employees for rendering their services for eqaul to "
				+ "or more than 5 years. Gratuity is paid to an employee as part of his/her salary and is considred to be a benifit plan which is "
				+ "designed to help the employee during his/her retirement.");
		
		Benefits benefits4 = new Benefits();
		benefits4.setBenefitId(100004);
		benefits4.setBenefitName("paid leaves");
		benefits4.setDescription("Giving workers the benifit of paid time off can increase employee happiness and morale.");
		
		List<Benefits> benefitsList = new ArrayList<>();
		benefitsList.add(benefits1);
		benefitsList.add(benefits2);
		benefitsList.add(benefits3);
		benefitsList.add(benefits4);
		
		Employee emp1 = new Employee();
		emp1.setEmployeeId(201);
		emp1.setEmployeeName("sagar");
		emp1.setSalary(25000.25);
		emp1.setLocationId(101);
		emp1.setDeptId(1001);
		emp1.setBenefitId(new ArrayList<>());
		emp1.benefitId.add(100001);
		emp1.benefitId.add(100002);
		emp1.benefitId.add(100003);
		emp1.benefitId.add(100004);
		
		Employee emp2 = new Employee();
		emp2.setEmployeeId(202);
		emp2.setEmployeeName("vikas");
		emp2.setSalary(27000.25);
		emp2.setLocationId(102);
		emp2.setDeptId(1002);
		emp2.setBenefitId(new ArrayList<>());
		emp2.benefitId.add(100002);
		emp2.benefitId.add(100003);
		emp2.benefitId.add(100004);
		
		Employee emp3 = new Employee();
		emp3.setEmployeeId(203);
		emp3.setEmployeeName("rakesh");
		emp3.setSalary(26000.25);
		emp3.setLocationId(103);
		emp3.setDeptId(1003);
		emp3.setBenefitId(new ArrayList<>());
		emp3.benefitId.add(100003);
		emp3.benefitId.add(100004);
		
		Employee emp4 = new Employee();
		emp4.setEmployeeId(204);
		emp4.setEmployeeName("prakash");
		emp4.setSalary(28000.25);
		emp4.setLocationId(101);
		emp4.setDeptId(1004);
		emp4.setBenefitId(new ArrayList<>());
		emp4.benefitId.add(100004);
		
		Employee emp5 = new Employee();
		emp5.setEmployeeId(205);
		emp5.setEmployeeName("venkat");
		emp5.setSalary(24000.25);
		emp5.setLocationId(102);
		emp5.setDeptId(1002);
		emp5.setBenefitId(new ArrayList<>());
		
		List<Employee> employeesList = new ArrayList<>();
		employeesList.add(emp1);
		employeesList.add(emp2);
		employeesList.add(emp3);
		employeesList.add(emp4);
		employeesList.add(emp5);
		
		//Retrieve all employees in India
		employeesList.stream().filter(emp -> emp.locationId == 101 || emp.locationId == 102).forEach(emp -> {
			System.out.println("employee id: " + emp.employeeId + " employee name: " + emp.employeeName + " Employee salary: " + emp.salary + " Location: " + emp.locationId + " Department: " + emp.getDeptId());
			emp.benefitId.forEach(e -> System.out.println("benefits id: " + e));
		});
		
//		employee id: 201 employee name: sagar Employee salary: 25000.25 Location: 101 Department: 1001
//		benefits id: 100001
//		benefits id: 100002
//		benefits id: 100003
//		benefits id: 100004
//		employee id: 202 employee name: vikas Employee salary: 27000.25 Location: 102 Department: 1002
//		benefits id: 100002
//		benefits id: 100003
//		benefits id: 100004
//		employee id: 204 employee name: prakash Employee salary: 28000.25 Location: 101 Department: 1004
//		benefits id: 100004
//		employee id: 205 employee name: venkat Employee salary: 24000.25 Location: 102 Department: 1002
		
		//Retrieve employees who are in Chennai or Hyderabad
		employeesList.stream().filter(emp -> emp.locationId == 101 || emp.locationId == 102).forEach(emp -> {
			System.out.println("employee id: " + emp.employeeId + " employee name: " + emp.employeeName + " Employee salary: " + emp.salary + " Location: " + emp.locationId + " Department: " + emp.getDeptId());
			emp.benefitId.forEach(e -> System.out.println("benefits id: " + e));
		});
//		employee id: 201 employee name: sagar Employee salary: 25000.25 Location: 101 Department: 1001
//		benefits id: 100001
//		benefits id: 100002
//		benefits id: 100003
//		benefits id: 100004
//		employee id: 202 employee name: vikas Employee salary: 27000.25 Location: 102 Department: 1002
//		benefits id: 100002
//		benefits id: 100003
//		benefits id: 100004
//		employee id: 204 employee name: prakash Employee salary: 28000.25 Location: 101 Department: 1004
//		benefits id: 100004
//		employee id: 205 employee name: venkat Employee salary: 24000.25 Location: 102 Department: 1002
		
		//Retrieve employees who have Benefits and display benefits details
		employeesList.stream().filter(emp -> emp.benefitId != null).forEach(emp -> {
			System.out.println("employee id: " + emp.employeeId + " employee name: " + emp.employeeName + " Employee salary: " + emp.salary + " Location: " + emp.locationId + " Department: " + emp.getDeptId());
			emp.benefitId.forEach(e ->{
				benefitsList.stream().filter(ben -> ben.benefitId == e).
				forEach(ben -> System.out.println("Benefit id:" + ben.benefitId + " Benefit Name: " + ben.benefitName + " Benefit Description: " + ben.description));
			});
		});
		
//		employee id: 201 employee name: sagar Employee salary: 25000.25 Location: 101 Department: 1001
//		Benefit id:100001 Benefit Name: health insurance Benefit Description: Employee health insurance is a benefit extended by individual's employer to their employees. it does not only cover the persons working for the employer but also covers the rest of family member under the policy.
//		Benefit id:100002 Benefit Name: pf Benefit Description: it is a retirement benefit scheme where, both the employer and the employee, contribute a certain sum every month till the employee is working
//		Benefit id:100003 Benefit Name: gratuity Benefit Description: Gratuity is an amount paid by an employer to its employees for rendering their services for eqaul to or more than 5 years. Gratuity is paid to an employee as part of his/her salary and is considred to be a benifit plan which is designed to help the employee during his/her retirement.
//		Benefit id:100004 Benefit Name: paid leaves Benefit Description: Giving workers the benifit of paid time off can increase employee happiness and morale.
//		employee id: 202 employee name: vikas Employee salary: 27000.25 Location: 102 Department: 1002
//		Benefit id:100002 Benefit Name: pf Benefit Description: it is a retirement benefit scheme where, both the employer and the employee, contribute a certain sum every month till the employee is working
//		Benefit id:100003 Benefit Name: gratuity Benefit Description: Gratuity is an amount paid by an employer to its employees for rendering their services for eqaul to or more than 5 years. Gratuity is paid to an employee as part of his/her salary and is considred to be a benifit plan which is designed to help the employee during his/her retirement.
//		Benefit id:100004 Benefit Name: paid leaves Benefit Description: Giving workers the benifit of paid time off can increase employee happiness and morale.
//		employee id: 203 employee name: rakesh Employee salary: 26000.25 Location: 103 Department: 1003
//		Benefit id:100003 Benefit Name: gratuity Benefit Description: Gratuity is an amount paid by an employer to its employees for rendering their services for eqaul to or more than 5 years. Gratuity is paid to an employee as part of his/her salary and is considred to be a benifit plan which is designed to help the employee during his/her retirement.
//		Benefit id:100004 Benefit Name: paid leaves Benefit Description: Giving workers the benifit of paid time off can increase employee happiness and morale.
//		employee id: 204 employee name: prakash Employee salary: 28000.25 Location: 101 Department: 1004
//		Benefit id:100004 Benefit Name: paid leaves Benefit Description: Giving workers the benifit of paid time off can increase employee happiness and morale.
//		employee id: 205 employee name: venkat Employee salary: 24000.25 Location: 102 Department: 1002

		//Retrieve employee details -  employeeId, employeeName, Salary, deptName, locationName, locationCountry
		employeesList.forEach(emp -> {
			System.out.println("Employee Id: " + emp.employeeId + " Employee Name: " + emp.employeeName + " employee salary: " + emp.salary);
			deptList.stream().filter(e -> e.deptId == emp.deptId).forEach(e -> System.out.println("employee Department: " + e.deptName));
			locList.stream().filter(e -> e.locationId == emp.locationId).forEach(e -> System.out.println("location Name: " + e.locationName + " Location Country: " + e.locationCountry));
		});
		
//		Employee Id: 201 Employee Name: sagar employee salary: 25000.25
//		employee Department: healthcare
//		location Name: hyderabad Location Country: india
//		Employee Id: 202 Employee Name: vikas employee salary: 27000.25
//		employee Department: finance
//		location Name: chennai Location Country: india
//		Employee Id: 203 Employee Name: rakesh employee salary: 26000.25
//		employee Department: admin
//		location Name: london Location Country: united kingdom
//		Employee Id: 204 Employee Name: prakash employee salary: 28000.25
//		employee Department: fraud
//		location Name: hyderabad Location Country: india
//		Employee Id: 205 Employee Name: venkat employee salary: 24000.25
//		employee Department: finance
//		location Name: chennai Location Country: india
		
		//Retrieve employees who are in Chennai and India
		employeesList.stream().filter(emp -> emp.locationId == 101 || emp.locationId == 102).forEach(emp -> {
		System.out.println("employee id: " + emp.employeeId + " employee name: " + emp.employeeName + " Employee salary: " + emp.salary + " Location: " + emp.locationId + " Department: " + emp.getDeptId());
		emp.benefitId.forEach(e -> System.out.println("benefits id: " + e));
		});
		
//		employee id: 201 employee name: sagar Employee salary: 25000.25 Location: 101 Department: 1001
//		benefits id: 100001
//		benefits id: 100002
//		benefits id: 100003
//		benefits id: 100004
//		employee id: 202 employee name: vikas Employee salary: 27000.25 Location: 102 Department: 1002
//		benefits id: 100002
//		benefits id: 100003
//		benefits id: 100004
//		employee id: 204 employee name: prakash Employee salary: 28000.25 Location: 101 Department: 1004
//		benefits id: 100004
//		employee id: 205 employee name: venkat Employee salary: 24000.25 Location: 102 Department: 1002
	}
}
