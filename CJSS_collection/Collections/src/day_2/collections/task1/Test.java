package day_2.collections.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {	
	public static void main(String[] args) {
		
		List<Subjects> subjectsList;
		List<Staff> staffList;
		List<Student> studentsList;
		List<Branch> branchList;
		List<AttendanceStudent> studentAttendanceList;
		List<AttendanceStaff> staffAttendanceList;

		AttendanceStudent atnd1 = new AttendanceStudent();
		atnd1.setStudentId(10001);
		atnd1.setAttendance(new HashMap<>());
		atnd1.attendance.put(LocalDate.of(2022, 06, 7), true);
		atnd1.attendance.put(LocalDate.of(2022, 06, 8), false);
		
		AttendanceStudent atnd2 = new AttendanceStudent();
		atnd2.setStudentId(10002);
		atnd2.setAttendance(new HashMap<>());
		atnd2.attendance.put(LocalDate.of(2022, 06, 7), false);
		atnd2.attendance.put(LocalDate.of(2022, 06, 8), true);
		
		AttendanceStudent atnd3 = new AttendanceStudent();
		atnd3.setStudentId(10003);
		atnd3.setAttendance(new HashMap<>());
		atnd3.attendance.put(LocalDate.of(2022, 06, 7), false);
		atnd3.attendance.put(LocalDate.of(2022, 06, 8), false);
		
		AttendanceStudent atnd4 = new AttendanceStudent();
		atnd4.setStudentId(10004);
		atnd4.setAttendance(new HashMap<>());
		atnd4.attendance.put(LocalDate.of(2022, 06, 7), true);
		atnd4.attendance.put(LocalDate.of(2022, 06, 8), true);
		
		AttendanceStudent atnd5 = new AttendanceStudent();
		atnd5.setStudentId(10005);
		atnd5.setAttendance(new HashMap<>());
		atnd5.attendance.put(LocalDate.of(2022, 06, 07), true);
		atnd5.attendance.put(LocalDate.of(2022, 06, 8), false);
		
		AttendanceStudent atnd6 = new AttendanceStudent();
		atnd6.setStudentId(10006);
		atnd6.setAttendance(new HashMap<>());
		atnd6.attendance.put(LocalDate.of(2022, 06, 07), false);
		atnd6.attendance.put(LocalDate.of(2022, 06, 8), true);
		
		AttendanceStudent atnd7 = new AttendanceStudent();
		atnd7.setStudentId(10007);
		atnd7.setAttendance(new HashMap<>());
		atnd7.attendance.put(LocalDate.of(2022, 06, 7), true);
		atnd7.attendance.put(LocalDate.now(), true);
		
		AttendanceStudent atnd8 = new AttendanceStudent();
		atnd8.setStudentId(10008);
		atnd8.setAttendance(new HashMap<>());
		atnd8.attendance.put(LocalDate.of(2022, 06, 7), false);
		atnd8.attendance.put(LocalDate.now(), true);
		
		AttendanceStudent atnd9 = new AttendanceStudent();
		atnd9.setStudentId(10009);
		atnd9.setAttendance(new HashMap<>());
		atnd9.attendance.put(LocalDate.of(2022, 06, 7), false);
		atnd9.attendance.put(LocalDate.of(2022, 06, 8), false);
		
		AttendanceStudent atnd10 = new AttendanceStudent();
		atnd10.setStudentId(10010);
		atnd10.setAttendance(new HashMap<>());
		atnd10.attendance.put(LocalDate.of(2022, 06, 7), true);
		atnd10.attendance.put(LocalDate.of(2022, 06, 8), true);
		
		AttendanceStudent atnd11 = new AttendanceStudent();
		atnd11.setStudentId(10011);
		atnd11.setAttendance(new HashMap<>());
		atnd11.attendance.put(LocalDate.of(2022, 06, 07), true);
		atnd11.attendance.put(LocalDate.of(2022, 06, 8), false);
		
		AttendanceStudent atnd12 = new AttendanceStudent();
		atnd12.setStudentId(10012);
		atnd12.setAttendance(new HashMap<>());
		atnd12.attendance.put(LocalDate.of(2022, 06, 07), false);
		atnd12.attendance.put(LocalDate.of(2022, 06, 8), true);
		
		AttendanceStudent atnd13 = new AttendanceStudent();
		atnd13.setStudentId(10013);
		atnd13.setAttendance(new HashMap<>());
		atnd13.attendance.put(LocalDate.of(2022, 06, 7), true);
		atnd13.attendance.put(LocalDate.of(2022, 06, 8), false);
		
		AttendanceStudent atnd14 = new AttendanceStudent();
		atnd14.setStudentId(10014);
		atnd14.setAttendance(new HashMap<>());
		atnd14.attendance.put(LocalDate.of(2022, 06, 7), false);
		atnd14.attendance.put(LocalDate.now(), true);
		
		AttendanceStudent atnd15 = new AttendanceStudent();
		atnd15.setStudentId(10015);
		atnd15.setAttendance(new HashMap<>());
		atnd15.attendance.put(LocalDate.of(2022, 06, 7), false);
		atnd15.attendance.put(LocalDate.now(), false);
		
		AttendanceStudent atnd16 = new AttendanceStudent();
		atnd16.setStudentId(10016);
		atnd16.setAttendance(new HashMap<>());
		atnd16.attendance.put(LocalDate.of(2022, 06, 7), true);
		atnd16.attendance.put(LocalDate.of(2022, 06, 8), true);
		
		AttendanceStudent atnd17 = new AttendanceStudent();
		atnd17.setStudentId(10017);
		atnd17.setAttendance(new HashMap<>());
		atnd17.attendance.put(LocalDate.of(2022, 06, 07), true);
		atnd17.attendance.put(LocalDate.of(2022, 06, 8), false);
		
		AttendanceStudent atnd18 = new AttendanceStudent();
		atnd18.setStudentId(10018);
		atnd18.setAttendance(new HashMap<>());
		atnd18.attendance.put(LocalDate.of(2022, 06, 07), false);
		atnd18.attendance.put(LocalDate.of(2022, 06, 8), true);
		
		AttendanceStudent atnd19 = new AttendanceStudent();
		atnd19.setStudentId(10019);
		atnd19.setAttendance(new HashMap<>());
		atnd19.attendance.put(LocalDate.of(2022, 06, 7), true);
		atnd19.attendance.put(LocalDate.of(2022, 06, 8), false);
		
		AttendanceStudent atnd20 = new AttendanceStudent();
		atnd20.setStudentId(10020);
		atnd20.setAttendance(new HashMap<>());
		atnd20.attendance.put(LocalDate.of(2022, 06, 7), false);
		atnd20.attendance.put(LocalDate.of(2022, 06, 8), true);
		
		AttendanceStudent atnd21 = new AttendanceStudent();
		atnd21.setStudentId(10021);
		atnd21.setAttendance(new HashMap<>());
		atnd21.attendance.put(LocalDate.of(2022, 06, 7), false);
		atnd21.attendance.put(LocalDate.of(2022, 06, 8), false);
		
		AttendanceStudent atnd22 = new AttendanceStudent();
		atnd22.setStudentId(10022);
		atnd22.setAttendance(new HashMap<>());
		atnd22.attendance.put(LocalDate.of(2022, 06, 7), true);
		atnd22.attendance.put(LocalDate.of(2022, 06, 8), true);
		
		AttendanceStudent atnd23 = new AttendanceStudent();
		atnd23.setStudentId(10023);
		atnd23.setAttendance(new HashMap<>());
		atnd23.attendance.put(LocalDate.of(2022, 06, 07), true);
		atnd23.attendance.put(LocalDate.of(2022, 06, 8), false);
		
		AttendanceStudent atnd24 = new AttendanceStudent();
		atnd24.setStudentId(10024);
		atnd24.setAttendance(new HashMap<>());
		atnd24.attendance.put(LocalDate.of(2022, 06, 07), false);
		atnd24.attendance.put(LocalDate.of(2022, 06, 8), true);
		
		List<AttendanceStudent> atdStd = new ArrayList<>();
		atdStd.add(atnd1);
		atdStd.add(atnd2);
		atdStd.add(atnd3);
		atdStd.add(atnd4);
		atdStd.add(atnd5);
		atdStd.add(atnd6);
		atdStd.add(atnd7);
		atdStd.add(atnd8);
		atdStd.add(atnd9);
		atdStd.add(atnd10);
		atdStd.add(atnd11);
		atdStd.add(atnd12);
		atdStd.add(atnd13);
		atdStd.add(atnd14);
		atdStd.add(atnd15);
		atdStd.add(atnd16);
		atdStd.add(atnd17);
		atdStd.add(atnd18);
		atdStd.add(atnd19);
		atdStd.add(atnd20);
		atdStd.add(atnd21);
		atdStd.add(atnd22);
		atdStd.add(atnd23);
		atdStd.add(atnd24);
		
		studentAttendanceList = atdStd;
		
		AttendanceStaff atndS1 = new AttendanceStaff();
		atndS1.setStaffId(11);
		atndS1.setAttendance(new HashMap<>());
		atndS1.attendance.put(LocalDate.of(2022, 06, 7), true);
		atndS1.attendance.put(LocalDate.now(), false);
		
		AttendanceStaff atndS2 = new AttendanceStaff();
		atndS2.setStaffId(12);
		atndS2.setAttendance(new HashMap<>());
		atndS2.attendance.put(LocalDate.of(2022, 06, 7), false);
		atndS2.attendance.put(LocalDate.now(), true);
		
		AttendanceStaff atndS3 = new AttendanceStaff();
		atndS3.setStaffId(13);
		atndS3.setAttendance(new HashMap<>());
		atndS3.attendance.put(LocalDate.of(2022, 06, 7), false);
		atndS3.attendance.put(LocalDate.now(), false);
		
		AttendanceStaff atndS4 = new AttendanceStaff();
		atndS4.setStaffId(14);
		atndS4.setAttendance(new HashMap<>());
		atndS4.attendance.put(LocalDate.of(2022, 06, 7), true);
		atndS4.attendance.put(LocalDate.now(), true);
		
		AttendanceStaff atndS5 = new AttendanceStaff();
		atndS5.setStaffId(15);
		atndS5.setAttendance(new HashMap<>());
		atndS5.attendance.put(LocalDate.of(2022, 06, 07), true);
		atndS5.attendance.put(LocalDate.now(), false);
		
		AttendanceStaff atndS6 = new AttendanceStaff();
		atndS6.setStaffId(16);
		atndS6.setAttendance(new HashMap<>());
		atndS6.attendance.put(LocalDate.of(2022, 06, 07), false);
		atndS6.attendance.put(LocalDate.now(), true);
		
		AttendanceStaff atndS7 = new AttendanceStaff();
		atndS7.setStaffId(17);
		atndS7.setAttendance(new HashMap<>());
		atndS7.attendance.put(LocalDate.of(2022, 06, 7), true);
		atndS7.attendance.put(LocalDate.now(), false);
		
		AttendanceStaff atndS8 = new AttendanceStaff();
		atndS8.setStaffId(18);
		atndS8.setAttendance(new HashMap<>());
		atndS8.attendance.put(LocalDate.of(2022, 06, 7), false);
		atndS8.attendance.put(LocalDate.now(), true);
		
		
		
		List<AttendanceStaff> atdSt = new ArrayList<>();
		atdSt.add(atndS1);
		atdSt.add(atndS2);
		atdSt.add(atndS3);
		atdSt.add(atndS4);
		atdSt.add(atndS5);
		atdSt.add(atndS6);
		atdSt.add(atndS7);
		atdSt.add(atndS8);
		
		staffAttendanceList = atdSt;
		
		Subjects sub1 = new Subjects();
		sub1.setSubjectId(1001);
		sub1.setSubjectName("subject1");
		sub1.setYear(1);
		sub1.setBranchId(101);
		
		Subjects sub2 = new Subjects();
		sub2.setSubjectId(1002);
		sub2.setSubjectName("subject2");
		sub2.setYear(1);
		sub2.setBranchId(101);
		
		Subjects sub3 = new Subjects();
		sub3.setSubjectId(1003);
		sub3.setSubjectName("subject1");
		sub3.setYear(2);
		sub3.setBranchId(101);
		
		Subjects sub4 = new Subjects();
		sub4.setSubjectId(1004);
		sub4.setSubjectName("subject2");
		sub4.setYear(2);
		sub4.setBranchId(101);
		
		Subjects sub5 = new Subjects();
		sub5.setSubjectId(1005);
		sub5.setSubjectName("subject1");
		sub5.setYear(3);
		sub5.setBranchId(101);
		
		Subjects sub6 = new Subjects();
		sub6.setSubjectId(1006);
		sub6.setSubjectName("subject2");
		sub6.setYear(3);
		sub6.setBranchId(101);
		
		Subjects sub7 = new Subjects();
		sub7.setSubjectId(1007);
		sub7.setSubjectName("subject1");
		sub7.setYear(1);
		sub7.setBranchId(102);
		
		Subjects sub8 = new Subjects();
		sub8.setSubjectId(1008);
		sub8.setSubjectName("subject2");
		sub8.setYear(1);
		sub8.setBranchId(102);
		
		Subjects sub9 = new Subjects();
		sub9.setSubjectId(1009);
		sub9.setSubjectName("subject1");
		sub9.setYear(2);
		sub9.setBranchId(102);
		
		Subjects sub10 = new Subjects();
		sub10.setSubjectId(1010);
		sub10.setSubjectName("subject2");
		sub10.setYear(2);
		sub10.setBranchId(102);
		
		Subjects sub11 = new Subjects();
		sub11.setSubjectId(1011);
		sub11.setSubjectName("subject1");
		sub11.setYear(3);
		sub11.setBranchId(102);
		
		Subjects sub12 = new Subjects();
		sub12.setSubjectId(1012);
		sub12.setSubjectName("subject2");
		sub12.setYear(3);
		sub12.setBranchId(102);
		
		Subjects sub13 = new Subjects();
		sub13.setSubjectId(1013);
		sub13.setSubjectName("subject1");
		sub13.setYear(1);
		sub13.setBranchId(103);
		
		Subjects sub14 = new Subjects();
		sub14.setSubjectId(1014);
		sub14.setSubjectName("subject2");
		sub14.setYear(1);
		sub14.setBranchId(103);
		
		Subjects sub15 = new Subjects();
		sub15.setSubjectId(1009);
		sub15.setSubjectName("subject1");
		sub15.setYear(2);
		sub15.setBranchId(103);
		
		Subjects sub16 = new Subjects();
		sub16.setSubjectId(1016);
		sub16.setSubjectName("subject2");
		sub16.setYear(2);
		sub16.setBranchId(103);
		
		Subjects sub17 = new Subjects();
		sub17.setSubjectId(1017);
		sub17.setSubjectName("subject1");
		sub17.setYear(3);
		sub17.setBranchId(103);
		
		Subjects sub18 = new Subjects();
		sub18.setSubjectId(1018);
		sub18.setSubjectName("subject2");
		sub18.setYear(3);
		sub18.setBranchId(103);
		
		Subjects sub19 = new Subjects();
		sub19.setSubjectId(1019);
		sub19.setSubjectName("subject1");
		sub19.setYear(1);
		sub19.setBranchId(104);
		
		Subjects sub20 = new Subjects();
		sub20.setSubjectId(1020);
		sub20.setSubjectName("subject2");
		sub20.setYear(1);
		sub20.setBranchId(104);
		
		Subjects sub21 = new Subjects();
		sub21.setSubjectId(1021);
		sub21.setSubjectName("subject1");
		sub21.setYear(2);
		sub21.setBranchId(104);
		
		Subjects sub22 = new Subjects();
		sub22.setSubjectId(1022);
		sub22.setSubjectName("subject2");
		sub22.setYear(2);
		sub22.setBranchId(104);
		
		Subjects sub23 = new Subjects();
		sub23.setSubjectId(1023);
		sub23.setSubjectName("subject1");
		sub23.setYear(3);
		sub23.setBranchId(104);
		
		Subjects sub24 = new Subjects();
		sub24.setSubjectId(1024);
		sub24.setSubjectName("subject2");
		sub24.setYear(3);
		sub24.setBranchId(104);
		
		List<Subjects> subList = new ArrayList<>();
		subList.add(sub1);
		subList.add(sub2);
		subList.add(sub3);
		subList.add(sub4);
		subList.add(sub5);
		subList.add(sub6);
		subList.add(sub7);
		subList.add(sub8);
		subList.add(sub9);
		subList.add(sub10);
		subList.add(sub11);
		subList.add(sub12);
		subList.add(sub13);
		subList.add(sub14);
		subList.add(sub15);
		subList.add(sub16);
		subList.add(sub17);
		subList.add(sub18);
		subList.add(sub19);
		subList.add(sub20);
		subList.add(sub21);
		subList.add(sub22);
		subList.add(sub23);
		subList.add(sub24);
		
		subjectsList = subList;
		
		Staff staff1 = new Staff();
		staff1.setStaffId(11);
		staff1.setStaffName("bansal");
		staff1.setStaffEmail("bansal@gmail.com");
		staff1.setSubjectId(new ArrayList<>());
		staff1.subjects.add(sub1);
		staff1.subjects.add(sub2);
		staff1.subjects.add(sub3);
		staff1.subjects.add(sub4);
		staff1.setAttendance(atndS1);
		
		Staff staff2 = new Staff();
		staff2.setStaffId(12);
		staff2.setStaffName("patak");
		staff2.setStaffEmail("patak@gmail.com");
		staff2.setSubjectId(new ArrayList<>());
		staff2.subjects.add(sub5);
		staff2.subjects.add(sub6);
		staff2.subjects.add(sub7);
		staff2.subjects.add(sub8);
		staff2.setAttendance(atndS2);
		
		Staff staff3 = new Staff();
		staff3.setStaffId(13);
		staff3.setStaffName("ranjit");
		staff3.setStaffEmail("ranjit@gmail.com");
		staff3.setSubjectId(new ArrayList<>());
		staff3.subjects.add(sub9);
		staff3.subjects.add(sub10);
		staff3.subjects.add(sub11);
		staff3.subjects.add(sub12);
		staff3.setAttendance(atndS3);
		
		Staff staff4 = new Staff();
		staff4.setStaffId(14);
		staff4.setStaffName("lokesh");
		staff4.setStaffEmail("lokesh@gmail.com");
		staff4.setSubjectId(new ArrayList<>());
		staff4.subjects.add(sub13);
		staff4.subjects.add(sub14);
		staff4.subjects.add(sub15);
		staff4.subjects.add(sub16);
		staff4.setAttendance(atndS4);
		
		Staff staff5 = new Staff();
		staff5.setStaffId(15);
		staff5.setStaffName("ranjinikant");
		staff5.setStaffEmail("rajinikant@gmail.com");
		staff5.setSubjectId(new ArrayList<>());
		staff5.subjects.add(sub17);
		staff5.subjects.add(sub18);
		staff5.setAttendance(atndS5);
		
		Staff staff6 = new Staff();
		staff6.setStaffId(16);
		staff6.setStaffName("ram");
		staff6.setStaffEmail("ram@gmail.com");
		staff6.setSubjectId(new ArrayList<>());
		staff6.subjects.add(sub19);
		staff6.subjects.add(sub20);
		staff6.setAttendance(atndS6);
		
		Staff staff7 = new Staff();
		staff7.setStaffId(17);
		staff7.setStaffName("krishna");
		staff7.setStaffEmail("krishna@gmail.com");
		staff7.setSubjectId(new ArrayList<>());
		staff7.subjects.add(sub21);
		staff7.subjects.add(sub22);
		staff7.subjects.add(sub23);
		staff7.setAttendance(atndS7);
		
		Staff staff8 = new Staff();
		staff8.setStaffId(18);
		staff8.setStaffName("shiva");
		staff8.setStaffEmail("shiva@gmail.com");
		staff8.setSubjectId(new ArrayList<>());
		staff8.subjects.add(sub24);
		staff8.setAttendance(atndS8);
		
		List<Staff> stList = new ArrayList<>();
		stList.add(staff1);
		stList.add(staff2);
		stList.add(staff3);
		stList.add(staff4);
		stList.add(staff5);
		stList.add(staff6);
		stList.add(staff7);
		stList.add(staff8);
		
		staffList = stList;
		
		Branch branch1 = new Branch();
		branch1.setBranchId(101);
		branch1.setBranchName("mech");
		
		Branch branch2 = new Branch();
		branch2.setBranchId(102);
		branch2.setBranchName("cse");
		
		Branch branch3 = new Branch();
		branch3.setBranchId(103);
		branch3.setBranchName("ENTC");
		
		Branch branch4 = new Branch();
		branch4.setBranchId(104);
		branch4.setBranchName("civil");
		
		List<Branch> brList = new ArrayList<>();
		brList.add(branch1);
		brList.add(branch2);
		brList.add(branch3);
		brList.add(branch4);
		
		branchList = brList;
		
		Marks marks1 = new Marks();
		marks1.setStudentId(10001);
		marks1.setMarks(new HashMap<>());
		marks1.marks.put(sub1, 65);
		marks1.marks.put(sub2, 75);
		
		Marks marks2 = new Marks();
		marks2.setStudentId(10002);
		marks2.setMarks(new HashMap<>());
		marks2.marks.put(sub1, 35);
		marks2.marks.put(sub2, 85);
		
		Marks marks3 = new Marks();
		marks3.setStudentId(10003);
		marks3.setMarks(new HashMap<>());
		marks3.marks.put(sub3, 95);
		marks3.marks.put(sub4, 45);
		
		Marks marks4 = new Marks();
		marks4.setStudentId(10004);
		marks4.setMarks(new HashMap<>());
		marks4.marks.put(sub3, 65);
		marks4.marks.put(sub4, 85);
		
		Marks marks5 = new Marks();
		marks5.setStudentId(10005);
		marks5.setMarks(new HashMap<>());
		marks5.marks.put(sub5, 55);
		marks5.marks.put(sub6, 45);
		
		Marks marks6 = new Marks();
		marks6.setStudentId(10006);
		marks6.setMarks(new HashMap<>());
		marks6.marks.put(sub5, 78);
		marks6.marks.put(sub6, 75);
		
		Marks marks7 = new Marks();
		marks7.setStudentId(10007);
		marks7.setMarks(new HashMap<>());
		marks7.marks.put(sub7, 35);
		marks7.marks.put(sub8, 85);
		
		Marks marks8 = new Marks();
		marks8.setStudentId(10008);
		marks8.setMarks(new HashMap<>());
		marks8.marks.put(sub7, 35);
		marks8.marks.put(sub8, 44);
		
		Marks marks9 = new Marks();
		marks9.setStudentId(10009);
		marks9.setMarks(new HashMap<>());
		marks9.marks.put(sub9, 85);
		marks9.marks.put(sub10, 75);
		
		Marks marks10 = new Marks();
		marks10.setStudentId(10010);
		marks10.setMarks(new HashMap<>());
		marks10.marks.put(sub9, 55);
		marks10.marks.put(sub10, 95);
		
		Marks marks11 = new Marks();
		marks11.setStudentId(10011);
		marks11.setMarks(new HashMap<>());
		marks11.marks.put(sub11, 45);
		marks11.marks.put(sub12, 65);
		
		Marks marks12 = new Marks();
		marks12.setStudentId(10012);
		marks12.setMarks(new HashMap<>());
		marks12.marks.put(sub11, 67);
		marks12.marks.put(sub12, 75);
		
		Marks marks13 = new Marks();
		marks13.setStudentId(10013);
		marks13.setMarks(new HashMap<>());
		marks13.marks.put(sub13, 95);
		marks13.marks.put(sub14, 75);
		
		Marks marks14 = new Marks();
		marks14.setStudentId(10014);
		marks14.setMarks(new HashMap<>());
		marks14.marks.put(sub13, 35);
		marks14.marks.put(sub14, 85);
		
		Marks marks15 = new Marks();
		marks15.setStudentId(10015);
		marks15.setMarks(new HashMap<>());
		marks15.marks.put(sub15, 35);
		marks15.marks.put(sub16, 55);
		
		Marks marks16 = new Marks();
		marks16.setStudentId(10016);
		marks16.setMarks(new HashMap<>());
		marks16.marks.put(sub15, 45);
		marks16.marks.put(sub16, 75);
		
		Marks marks17 = new Marks();
		marks17.setStudentId(10017);
		marks17.setMarks(new HashMap<>());
		marks17.marks.put(sub17, 69);
		marks17.marks.put(sub18, 74);
		
		Marks marks18 = new Marks();
		marks18.setStudentId(10018);
		marks18.setMarks(new HashMap<>());
		marks18.marks.put(sub17, 68);
		marks18.marks.put(sub18, 62);
		
		Marks marks19 = new Marks();
		marks19.setStudentId(10019);
		marks19.setMarks(new HashMap<>());
		marks19.marks.put(sub19, 41);
		marks19.marks.put(sub20, 53);
		
		Marks marks20 = new Marks();
		marks20.setStudentId(10020);
		marks20.setMarks(new HashMap<>());
		marks20.marks.put(sub19, 92);
		marks20.marks.put(sub20, 98);
		
		Marks marks21 = new Marks();
		marks21.setStudentId(10021);
		marks21.setMarks(new HashMap<>());
		marks21.marks.put(sub21, 35);
		marks21.marks.put(sub22, 85);
		
		Marks marks22 = new Marks();
		marks22.setStudentId(10022);
		marks22.setMarks(new HashMap<>());
		marks22.marks.put(sub21, 45);
		marks22.marks.put(sub22, 49);
		
		Marks marks23 = new Marks();
		marks23.setStudentId(10023);
		marks23.setMarks(new HashMap<>());
		marks23.marks.put(sub23, 75);
		marks23.marks.put(sub24, 79);
		
		Marks marks24 = new Marks();
		marks24.setStudentId(10024);
		marks24.setMarks(new HashMap<>());
		marks24.marks.put(sub23, 49);
		marks24.marks.put(sub24, 55);
		
		Student std1 = new Student();
		std1.setStudentId(10001);
		std1.setStudentName("sagar");
		std1.setStudentEmail("sagar@gmail.com");
		std1.setBranchId(branch1);
		std1.setYear(1);
		std1.setAttendance(atnd1);
		std1.setMarks(marks1);
		
		Student std2 = new Student();
		std2.setStudentId(10002);
		std2.setStudentName("pawan");
		std2.setStudentEmail("pawan@gmail.com");
		std2.setBranchId(branch1);
		std2.setYear(1);
		std2.setAttendance(atnd2);
		std2.setMarks(marks2);
		
		Student std3 = new Student();
		std3.setStudentId(10003);
		std3.setStudentName("jaya");
		std3.setStudentEmail("jaya@gmail.com");
		std3.setBranchId(branch1);
		std3.setYear(2);
		std3.setAttendance(atnd3);
		std3.setMarks(marks3);
		
		Student std4 = new Student();
		std4.setStudentId(10004);
		std4.setStudentName("hrishi");
		std4.setStudentEmail("hrishi@gmail.com");
		std4.setBranchId(branch1);
		std4.setYear(2);
		std4.setAttendance(atnd4);
		std4.setMarks(marks4);
		
		Student std5 = new Student();
		std5.setStudentId(10005);
		std5.setStudentName("loki");
		std5.setStudentEmail("loki@gmail.com");
		std5.setBranchId(branch1);
		std5.setYear(3);
		std5.setAttendance(atnd5);
		std5.setMarks(marks5);
		
		Student std6 = new Student();
		std6.setStudentId(10006);
		std6.setStudentName("rakesh");
		std6.setStudentEmail("rakesh@gmail.com");
		std6.setBranchId(branch1);
		std6.setYear(3);
		std6.setAttendance(atnd16);
		std6.setMarks(marks6);
		
		Student std7 = new Student();
		std7.setStudentId(10007);
		std7.setStudentName("nikhil");
		std7.setStudentEmail("nikhil@gmail.com");
		std7.setBranchId(branch2);
		std7.setYear(1);
		std7.setAttendance(atnd7);
		std7.setMarks(marks7);
		
		Student std8 = new Student();
		std8.setStudentId(10008);
		std8.setStudentName("rohit");
		std8.setStudentEmail("rohit@gmail.com");
		std8.setBranchId(branch2);
		std8.setYear(1);
		std8.setAttendance(atnd8);
		std8.setMarks(marks8);
		
		Student std9 = new Student();
		std9.setStudentId(10009);
		std9.setStudentName("virat");
		std9.setStudentEmail("virat@gmail.com");
		std9.setBranchId(branch2);
		std9.setYear(2);
		std9.setAttendance(atnd9);
		std9.setMarks(marks9);
		
		Student std10 = new Student();
		std10.setStudentId(10010);
		std10.setStudentName("rishab");
		std10.setStudentEmail("rishab@gmail.com");
		std10.setBranchId(branch2);
		std10.setYear(2);
		std10.setAttendance(atnd10);
		std10.setMarks(marks10);
		
		Student std11 = new Student();
		std11.setStudentId(10011);
		std11.setStudentName("prashant");
		std11.setStudentEmail("prashant@gmail.com");
		std11.setBranchId(branch2);
		std11.setYear(3);
		std11.setAttendance(atnd11);
		std11.setMarks(marks11);
		
		Student std12 = new Student();
		std12.setStudentId(10012);
		std12.setStudentName("manju");
		std12.setStudentEmail("manju@gmail.com");
		std12.setBranchId(branch2);
		std12.setYear(3);
		std12.setAttendance(atnd12);
		std12.setMarks(marks12);
		
		Student std13 = new Student();
		std13.setStudentId(10013);
		std13.setStudentName("rahul");
		std13.setStudentEmail("rahul@gmail.com");
		std13.setBranchId(branch3);
		std13.setYear(1);
		std13.setAttendance(atnd13);
		std13.setMarks(marks13);
		
		Student std14 = new Student();
		std14.setStudentId(10014);
		std14.setStudentName("kandu");
		std14.setStudentEmail("kandu@gmail.com");
		std14.setBranchId(branch3);
		std14.setYear(1);
		std14.setAttendance(atnd14);
		std14.setMarks(marks14);
		
		Student std15 = new Student();
		std15.setStudentId(10015);
		std15.setStudentName("vikas");
		std15.setStudentEmail("vikas@gmail.com");
		std15.setBranchId(branch3);
		std15.setYear(2);
		std15.setAttendance(atnd15);
		std15.setMarks(marks15);
		
		Student std16 = new Student();
		std16.setStudentId(10016);
		std16.setStudentName("shreyash");
		std16.setStudentEmail("shreyash@gmail.com");
		std16.setBranchId(branch3);
		std16.setYear(2);
		std16.setAttendance(atnd16);
		std16.setMarks(marks16);
		
		Student std17 = new Student();
		std17.setStudentId(10017);
		std17.setStudentName("ashawin");
		std17.setStudentEmail("ashawin@gmail.com");
		std17.setBranchId(branch3);
		std17.setYear(3);
		std17.setAttendance(atnd17);
		std17.setMarks(marks17);
		
		Student std18 = new Student();
		std18.setStudentId(10018);
		std18.setStudentName("bhuvi");
		std18.setStudentEmail("bhuvi@gmail.com");
		std18.setBranchId(branch3);
		std18.setYear(3);
		std18.setAttendance(atnd18);
		std18.setMarks(marks18);
		
		Student std19 = new Student();
		std19.setStudentId(10019);
		std19.setStudentName("jassi");
		std19.setStudentEmail("jassi@gmail.com");
		std19.setBranchId(branch4);
		std19.setYear(1);
		std19.setAttendance(atnd19);
		std19.setMarks(marks19);
		
		Student std20 = new Student();
		std20.setStudentId(10020);
		std20.setStudentName("hardik");
		std20.setStudentEmail("hardik@gmail.com");
		std20.setBranchId(branch4);
		std20.setYear(1);
		std20.setAttendance(atnd20);
		std20.setMarks(marks20);
		
		Student std21 = new Student();
		std21.setStudentId(10021);
		std21.setStudentName("yuvi");
		std21.setStudentEmail("yuvi@gmail.com");
		std21.setBranchId(branch4);
		std21.setYear(2);
		std21.setAttendance(atnd21);
		std21.setMarks(marks21);
		
		Student std22 = new Student();
		std22.setStudentId(10022);
		std22.setStudentName("dhoni");
		std22.setStudentEmail("dhoni@gmail.com");
		std22.setBranchId(branch4);
		std22.setYear(2);
		std22.setAttendance(atnd22);
		std22.setMarks(marks22);
		
		Student std23 = new Student();
		std23.setStudentId(10023);
		std23.setStudentName("sachin");
		std23.setStudentEmail("sachin@gmail.com");
		std23.setBranchId(branch4);
		std23.setYear(3);
		std23.setAttendance(atnd23);
		std23.setMarks(marks23);
		
		Student std24 = new Student();
		std24.setStudentId(10024);
		std24.setStudentName("stark");
		std24.setStudentEmail("stark@gmail.com");
		std24.setBranchId(branch4);
		std24.setYear(3);
		std24.setAttendance(atnd24);
		std24.setMarks(marks24);
		
		List<Student> stdList = new ArrayList<>();

		stdList.add(std1);
		stdList.add(std2);
		stdList.add(std3);
		stdList.add(std4);
		stdList.add(std5);
		stdList.add(std6);
		stdList.add(std7);
		stdList.add(std8);
		stdList.add(std9);
		stdList.add(std10);
		stdList.add(std11);
		stdList.add(std12);
		stdList.add(std13);
		stdList.add(std14);
		stdList.add(std15);
		stdList.add(std16);
		stdList.add(std17);
		stdList.add(std18);
		stdList.add(std19);
		stdList.add(std20);
		stdList.add(std21);
		stdList.add(std22);
		stdList.add(std23);
		stdList.add(std24);
		
		studentsList = stdList;
		
		//1
		System.out.println("Retrieve student details in year 1");
		studentsList.stream().filter(std -> std.year == 1).forEach(std -> System.out.println(std));
		
		//2
		System.out.println();
		System.out.println();
		System.out.println(" Retrieve staff details who teach year 1");
		staffList.stream().filter(staff ->staff.getSubjects().stream().anyMatch(s1 -> s1.getYear() == 1))
		.forEach(sta -> System.out.println(sta));
		
		//3
		System.out.println();
		System.out.println();
		System.out.println(" Retrieve student who is present today in year 1 and branch CSE");
		studentsList.forEach(std -> {
			Set<Entry<LocalDate, Boolean>> newStd = std.getAttendance().getAttendance().entrySet();
			for (Entry<LocalDate, Boolean> studEntry : newStd) {
				if (studEntry.getKey().isEqual(LocalDate.now()) && studEntry.getValue() == true) {
					if (std.getBranch().branchName.equals("cse")) {
						System.out.println(std);
					}
				}
			}
		});
		
		//4
		System.out.println();
		System.out.println();
		System.out.println("Retrieve staff who is present today and who teaches Subject1");
		staffList.forEach(staff -> {
			Set<Entry<LocalDate, Boolean>> newStaff = staff.getAttendance().getAttendance().entrySet();
			for (Entry<LocalDate, Boolean> staffEntry : newStaff) {
				if (staffEntry.getKey().isEqual(LocalDate.now()) && staffEntry.getValue() == true) {
					for (Subjects sub : staff.getSubjects() ) {
						if (sub.getSubjectName().equals("subject1")) {
							System.out.println(staff);
						}
					}
				}
			}
		});

		//5
		System.out.println();
		System.out.println();
		System.out.println("Retrieve students who are not passed in year 1");
		studentsList.stream().filter(std -> std.getYear() == 1).forEach(std -> {
			Set<Entry<Subjects, Integer>> stdMarks = std.getMarks().getMarks().entrySet();
			for (Entry<Subjects, Integer> newStdMarks : stdMarks) {
				if (newStdMarks.getValue() < 40) {
					System.out.println(std);
				}
			}
		});
		
		
		//6
		System.out.println();
		System.out.println();
		System.out.println("Retrieve staff who teaches more than 2 subjects in year 2");
		staffList.stream().filter(staff -> staff.subjects.size() > 2).forEach(staff -> System.out.println(staff));
	}
}
