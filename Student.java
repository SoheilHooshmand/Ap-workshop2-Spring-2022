package package1;

public class Student {

	private String firstname;
	
	private String lastname;
	
	//student's id contains at least 7 digits, e.g: 9931078
	private String id;
	
	private double grade;
	
	public Student(String firstname, String lastname, String id) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
		// asuming that the student's grade is zero
		grade = 0;
	}
	
	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public void printStudentInfo() {
		System.out.println(firstname + " " + lastname + "\nID: " + id + "\nGRADE: " + grade);
	}
}
