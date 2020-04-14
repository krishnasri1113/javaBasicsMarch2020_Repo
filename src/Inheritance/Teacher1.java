package Inheritance;

public class Teacher1 {
	
	 String designation;
	 String collegename;
	 
	 public String getdesignation()
	 {
		 return designation;
	 }
	 protected void setdesignation(String Designation)
	 {
		 this.designation=Designation;
	 }
	 protected String getcollegename()
	 {
		 return collegename;
		 
	 }
	 protected void setcollegename(String CollegeName)
	 {
		 this.collegename=CollegeName;
	 }
	 void Teach()
	 {
		 System.out.println("Teaching");
	 }
}
