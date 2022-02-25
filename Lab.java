package package1;

public class Lab {

	private Student[] students;
	private String teacherName;
	// the day in which this lab is held
	private String dayOfWeak;
	private int maxSize;
	private int currentSize;
	private double avgGrade;

	public Lab(String teacherName, String dayOfWeak, int maxSize) {
		this.teacherName = teacherName;
		this.dayOfWeak = dayOfWeak;
		this.maxSize = maxSize;
		// create an array of students whit the size of "maxSize"
		students = new Student[maxSize];
	}

	// because the initial value of the scores by default is zero, so the average is
	// also zero
	void calAvg() {
		double sum = 0;
		for (int i = 0; i < maxSize; i++) {
			sum += students[i].getGrade();
		}
		double avg = sum / maxSize;
		System.out.println("Averege is : " + avg);
	}

	// enter student information
	void enrollStudent(Student[] students) {
		this.students = students;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getDayOfWeak() {
		return dayOfWeak;
	}

	public void setDayOfWeak(String dayOfWeak) {
		this.dayOfWeak = dayOfWeak;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public int getCurrentSize() {
		return currentSize;
	}

	public void setCurrentSize(int currentSize) {
		this.currentSize = currentSize;
	}

	public double getAvgGrade() {
		return avgGrade;
	}

	public void setAvgGrade(double avgGrade) {
		this.avgGrade = avgGrade;
	}
	
	void print() {
		System.out.println("Teacher name is :" + teacherName);
		System.out.println("Day of weak is :" + dayOfWeak);
		System.out.println("Max size is :" + maxSize);
		for (int i = 0; i < maxSize; i++) {
			students[i].printStudentInfo();
		}
	}

}
