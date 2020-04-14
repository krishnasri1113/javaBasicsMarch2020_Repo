package Collections;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Student  implements Comparable<Student>{

	String name;
	int Age;
	int height;
	
	Student(String Name,int age,int Height)
	{
		this.name=Name;
		this.Age=age;
		this.height=Height;
	}

	@Override
	public int compareTo(Student s) {
		//return 0 means both are equal
		//+ve means the input is bigger
		//-ve means the this  is  bigger
		return this.Age-s.Age;//ascending the Age
		//return s.Age-this.Age;//descending the age
		//return this.height-s.height;//Ascending the height
		//return this.name.compareTo(s.name);//ascending the name
		//return this.name.compareTo(s.name)*-1;//this is for  descending student names
	
		
	}

}


public class StudentLinkedList {

	public static void main(String[] args) {
		String s1="Siri";
		String s2="siri";
		System.out.println(s1.compareTo(s2));
		ArrayList<Student> studentdetails1=new ArrayList<>();//Arraylist and linked list both are same
	    LinkedList<Student> studentlist=new LinkedList<>();//Arraylist is limited for low no of records.
	    
	    studentlist.add(new Student("siri",23,120)); //here 23 is this value and 34 is input value
	    studentlist.add(new Student("chintu",34,170));//this.id-s.id=23-34=-11i.e this is bigger i.e 23
	    studentlist.add(new Student("santhu",19,110));
	    studentlist.add(new Student("srihan",25,200));
	    System.out.println("before sorting studentdetails are");
	    Iterator<Student> it=studentlist.iterator();
	    while(it.hasNext())
	    {
	    	Student tempstudent=it.next();
	    	System.out.println("1.Student Age is: "+tempstudent.Age+" name is "+tempstudent.name+" height is "+tempstudent.height);
	    }
	    
	    
	    Collections.sort(studentlist);
	    System.out.println("---After sorting student details are---");
	    
	    Iterator<Student> it1=studentlist.iterator();
	    while(it1.hasNext())
	    {
	    	Student tempstudent=it1.next();
	    	System.out.println("2.Student Age: "+tempstudent.Age+" name is "+tempstudent.name+" height is "+tempstudent.height);
	    }

	}
 
}
