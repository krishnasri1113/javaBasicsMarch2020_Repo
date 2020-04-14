//Create student class with name(String type) and RegNo (int type) attributes. 
//use any collection to Store 5 student information. Sort using student name 


package CollectionsAssignment;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
class student implements Comparable<student>
{
	String sname;
	int RegNo;
	
	public student(String sname,int RegNo) //created constructor
	{
		this.sname=sname;
		this.RegNo=RegNo;
	}


	public int compareTo(student s) {
	
		return this.sname.compareTo(s.sname);
	}

}


public class StudentArrayList {

	public static void main(String[] args) {
		 ArrayList<student> studentlist=new ArrayList<>();
		  student s1=new student("siri",10);
		  student s2=new student("srihan",5);
		  student s3=new student("santhu",12);
		  student s4=new student("Anu",23);
		  studentlist.add(s1);
		  studentlist.add(s2);
		  studentlist.add(s3);
		  studentlist.add(s4);
		  Collections.sort(studentlist);
		  Iterator<student> it=studentlist.iterator();
		  while(it.hasNext())
		  {
			  student stdnt=it.next();
			  System.out.println("Student name is "+stdnt.sname+" RegNo is "+stdnt.RegNo);
		  }
	}

}
