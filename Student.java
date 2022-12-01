package week1.day1;

import org.apache.xmlbeans.impl.soap.Detail;

public class Student {
	String studentName="sivaumayal";
	int rollno=485679;
	String collegeName="abc college";
	int markScored=800;
	float cgpa=8.5f;
	
	public static void main(String[] args) {
		
		String studentName="sivaumayal";
		int rollno=485679;
		String collegeName="abc college";
		int markScored=800;
		float cgpa=8.5f;
		Student report =new Student();
		
		System.out.println(report.studentName);
		System.out.println(report.rollno);
		System.out.println(report.collegeName);
		System.out.println(report.markScored);
		System.out.println(report.cgpa);
		
		
		
		

	}

}
