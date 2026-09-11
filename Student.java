public class Student {
	
	
	static String collgename="JBREC";
	String Studentname;
	int studentid;
	double Studentmarks;

	public static void main(String[] args) {
		System.out.println("STUDENT DETAILS:");
		Student s1=new Student();
		s1.Studentname="Akhila";
		s1.studentid=101;
		s1.Studentmarks=90;
		System.out.println("ColgeName:"+collgename);
		System.out.println("Studentname:"+s1.Studentname);
		System.out.println("Studentid:"+s1.studentid);
		System.out.println("Studentmarks:"+s1.Studentmarks);
		
	}

}