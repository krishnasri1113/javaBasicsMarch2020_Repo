package Inheritance;

public class Entry1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhysicsTeacher p1=new PhysicsTeacher();
		System.out.println(p1.CollegeName);
		System.out.println(p1.designation);
		System.out.println(p1.Designation);//if you have two members with same name it will take child class value
	      p1.MainSubject="Physics";
	      System.out.println(p1.MainSubject);
	      p1.Teach();
	      p1.Teach();
		

	}

}
