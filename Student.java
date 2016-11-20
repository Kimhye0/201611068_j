import java.util.ArrayList;
import java.util.Collections;

public class Student{
	private String name;
	private int studentNum;

	Student(String name, int sNum){
		this.name = name;
		this.studentNum = sNum;
	}
	public String getName(){
		return name;
	}
	public static void main(String[] args) {		
	
		ArrayList<String> studentNameList = new ArrayList<String>();

		Student s1 = new Student("khw", 201611068);
		Student s2 = new Student("hw.k", 11068);
		Student s3 = new Student("whk", 86011);

		studentNameList.add(s1.getName());
		studentNameList.add(s2.getName());
		studentNameList.add(s3.getName());

		Collections.sort(studentNameList);
		System.out.println(studentNameList);
	}

}