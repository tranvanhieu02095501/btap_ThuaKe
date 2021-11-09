package btap_KeThua;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentManagement_2 {
	private Student_2 studentList[];
	private final static String fileName = "StudentMangement_Bai2.txt";
	public StudentManagement_2() {
		
	}

	public Student_2[] getStudentList() {
		return studentList;
	}

	

	

	@Override
	public String toString() {
		return "StudentManagement_Bai2 [getStudentList()=" + Arrays.toString(getStudentList()) + "]";
	}

	void input(int size) {
		studentList = new Student_2[size];
		for (int i=0; i<size; i++) {
			studentList[i] = new Student_2();
			getStudentList()[i].inputStudent();
		}
	}
	
	void output(int size) throws IOException  {
		input(size);
		File file = new File(fileName);
		OutputStream outputStream = new FileOutputStream(file);
        @SuppressWarnings("resource")
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
		 for (int i=0; i<studentList.length; i++) {
			getStudentList()[i].outputStudent();
			String data = getStudentList()[i].toString();
			outputStreamWriter.write(data);
			outputStreamWriter.write("\n");
		}
		 outputStreamWriter.flush();
	}
	
	void sort_Student() throws CloneNotSupportedException {
		for (int i=0; i<getStudentList().length-1; i++) {
			for (int j=i+1; j<getStudentList().length; j++) {
				if (getStudentList()[i].getSocial_activities() < getStudentList()[j].getSocial_activities()) {
					Student_2 temp = (Student_2) getStudentList()[i].clone();
					getStudentList()[i] = (Student_2) getStudentList()[j].clone();
					getStudentList()[j] = (Student_2) temp.clone();
				}
			}
		}
		System.out.println("Descending order of social activies: \n");
		for (int i=0; i<getStudentList().length; i++) {
			System.out.println("====== " + getStudentList()[i].getStudentID() + " ====== \n");
			getStudentList()[i].outputStudent();
		}
	}

	public static void main(String[] args) throws CloneNotSupportedException, IOException{
		// TODO Auto-generated method stub
		StudentManagement_2 sm = new StudentManagement_2();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter quantity of student: ");
		int size = scanner.nextInt();
		sm.output(size);
		sm.sort_Student();
		
		ArrayList<Student_2>studentArrayList = new ArrayList<Student_2>(); 
      try{
          FileInputStream fis = new FileInputStream(fileName);
          InputStreamReader isr = new InputStreamReader(fis);
          BufferedReader bfr = new BufferedReader(isr);
          String line = bfr.readLine();
          while(line != null){
              String []array = line.split(",");
              
	          if (array.length == 7) {
	        	  Student_2 s = new Student_2();
	        	  s.setStudentID(array[0]);
	        	  s.setName(array[1]);
	        	  s.setGender(array[2].charAt(0));
	        	  s.setBirth_year(Integer.parseInt(array[3]));
	        	  s.setAcademic_year(Integer.parseInt(array[4]));
	        	  s.setGpa(Float.parseFloat(array[5]));
	        	  s.setSocial_activities(Float.parseFloat(array[6]));
	        	  
	        	  studentArrayList.add(s);
	          }
	         
	          //System.out.println(line);
	          System.out.println("File " + fileName + " in ArrayList: \n");
	          for (int i=0; i<studentArrayList.size(); i++) {
	        	  	System.out.println("ID: " + studentArrayList.get(i).getStudentID());
		          	System.out.println("Name: " + studentArrayList.get(i).getName());
		          	System.out.println("Gender: " + studentArrayList.get(i).getGender());
		          	System.out.println("Birth year: " + studentArrayList.get(i).getBirth_year());
		          	System.out.println("Academic year: " + studentArrayList.get(i).getAcademic_year());
		          	System.out.println("GPA: " + studentArrayList.get(i).getGpa());
		          	System.out.println("Social Activities: " + studentArrayList.get(i).getSocial_activities());
		          	System.out.println();
	          }
              line = bfr.readLine();
          }
          fis.close();
          isr.close();
          bfr.close();
      }
      catch(Exception ex){
          ex.printStackTrace();
      }
        scanner.close();
	}

}