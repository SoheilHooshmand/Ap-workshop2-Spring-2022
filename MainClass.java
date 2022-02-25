package package1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		System.out.print("Please enter size of class: ");
		int sizeOfClass = in.nextInt();
		Student[] student = new Student[sizeOfClass];
		
		System.out.println("Please enter students information (firstname, lastname, id and grade): ");
		for (int i = 0; i < sizeOfClass; i++) {
			String studentFirstName = in.next();
			String studentLastName = in.next();
			String id = in.next();
			double studentGrade = in.nextDouble();
			student[i] = new Student(studentFirstName, studentLastName, id);
			student[i].setGrade(studentGrade);
		}
		System.out.print("Please enter teacher's name: ");
		String teacherName = in.next();
		System.out.print("Please enter day of weake that workshop handels: ");
		String dayOfWeak = in.next();
		Lab lab = new Lab(teacherName,dayOfWeak, sizeOfClass);
		
		lab.setTeacherName(teacherName);
		lab.setStudents(student);
		lab.setMaxSize(sizeOfClass);
		lab.print();
		lab.calAvg();
	}

}
