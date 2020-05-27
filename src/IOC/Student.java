package IOC;

public class Student {
	
	private String studentName;
	private int id;
	
	private MathCheat mathCheat;
	
	
	
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void cheating() {
		mathCheat.mathCheat();
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void displayInfo() {
		System.out.println(studentName + id);
	}
}
