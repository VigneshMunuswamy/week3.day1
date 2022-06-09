package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Student Id: "+id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student Id: "+id);
		System.out.println("Student Name: "+name);
	}


	public void getStudentInfo(String email, long phno) {
		System.out.println("Student Email Id: "+email);
		System.out.println("Student Phone number: "+phno);
	}
	
	public static void main(String[] args) {
		Students me= new Students();
		me.getStudentInfo(101);
		me.getStudentInfo(102, "Vignesh");
		me.getStudentInfo("vignesh@gmail.com", 9887766554L);
	}
}

