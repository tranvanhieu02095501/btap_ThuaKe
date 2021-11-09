package btap_KeThua;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Person_2 implements Comparable<Person_2>, Serializable, Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private char gender; // 0 is boy / 1 is girl
	private int birth_year;
	/**
	 * @param name
	 * @param gender
	 * @param birth_year
	 */
	public Person_2() {
		super();
	}
	public Person_2(String name, char gender, int birth_year) {
		super();
		this.name = name;
		this.gender = gender;
		this.birth_year = birth_year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getBirth_year() {
		return birth_year;
	}
	public void setBirth_year(int birth_year) {
		this.birth_year = birth_year;
	}
	
	void inputPerson() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("name= ");
		name = scanner.nextLine();
		System.out.print("gender(0 is boy / 1 is girl)= ");
		gender = scanner.next().charAt(0);
		System.out.print("birth year= ");
		birth_year = scanner.nextInt();
	}
	
	void outPerson() {
		System.out.println("Name: " + getName());
		System.out.println("Gender: " + getGender());
		System.out.println("Birth year: " + getBirth_year());
	}

	public int compareTo(Student_2 s) {
		// TODO Auto-generated method stub
		return 0;
	}
}