package btap_KeThua;

import java.util.Scanner;

public abstract class Person_1 {
	private String name;
	private char gender; 
	private int birth_year;
	
	public Person_1() {
		super();
	}
	public Person_1(String name, char gender, int birth_year) {
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
}