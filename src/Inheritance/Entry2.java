package Inheritance;

public class Entry2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhysicsTeacher1 p1=new PhysicsTeacher1();
		p1.setcollegename("SBIT");
		p1.setdesignation("Teacher");
		p1.getcollegename();
		p1.getdesignation();
		System.out.println(p1.collegename);
		System.out.println(p1.designation);
		System.out.println(p1.mainsub);
		p1.Teach();
	}

}
