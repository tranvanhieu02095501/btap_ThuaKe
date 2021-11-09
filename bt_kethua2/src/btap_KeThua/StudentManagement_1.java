package btap_KeThua;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class StudentManagement_1 {

	private ArrayList<Student_1> studentList = new ArrayList<>();
	
	public StudentManagement_1() {
		
	}
	
	public ArrayList<Student_1> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student_1> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "StudentManagement_Bai1 [studentList=" + studentList + ", getStudentList()=" + getStudentList() + "]";
	}
	
	 void input(int n) {
		for (int i=0; i<n; i++) {
			System.out.println("Enter student information " + (i+1) + ": ");
			Student_1 s = new Student_1();
			s.inputStudent();
			getStudentList().add(s);
		}
	}
	
	 void output(int n) {
		input(n);
		for (int i=0; i<getStudentList().size(); i++) {
			System.out.println("\n ========== " + getStudentList().get(i).getStudentID() + " ==========");
			getStudentList().get(i).outputStudent();
		}
	}
	
	void findBirthYear(int year) {
		Vector<Object> studentVector = new Vector<>();
		for (int i=0; i<getStudentList().size(); i++) {
			if(getStudentList().get(i).getBirth_year() == year) {
				studentVector.add("\n Mã: " + getStudentList().get(i).getStudentID());
				studentVector.add("Tên: " + getStudentList().get(i).getName());
				studentVector.add("Giới tính: " + getStudentList().get(i).getGender());
				studentVector.add("Năm sinh: " + getStudentList().get(i).getBirth_year());
				studentVector.add("Năm nhập h�?c: " + getStudentList().get(i).getAcademic_year() + "\n");
			}
		}
		System.out.println("Students has birth year is " + year + ": " + studentVector);
	}
	
	void findName(String name) {
		Vector<Object> studentVector = new Vector<>();
		for (int i=0; i<getStudentList().size(); i++) {
			if(getStudentList().get(i).getName().equals(name)) {
				studentVector.add("\n Mã: " + getStudentList().get(i).getStudentID());
				studentVector.add("Tên: " + getStudentList().get(i).getName());
				studentVector.add("Giới tính: " + getStudentList().get(i).getGender());
				studentVector.add("Năm sinh: " + getStudentList().get(i).getBirth_year());
				studentVector.add("Năm nhập h�?c: " + getStudentList().get(i).getAcademic_year() + "\n");
			}
		}
		System.out.println("Students has name is " + name + ": " + studentVector);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManagement_1 sm = new StudentManagement_1();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter quantity of student= ");
		int n = scanner.nextInt();
		sm.output(n);
		System.out.print("Enter year= ");
		int year = scanner.nextInt();
		sm.findBirthYear(year);
		scanner.nextLine();
		System.out.print("Enter name= ");
		String name = scanner.nextLine();
		sm.findName(name);
		scanner.close();
	}

}