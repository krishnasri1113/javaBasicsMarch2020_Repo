//Write a program to get the position of a particular element in an Array List?

package CollectionsAssignment;

import java.util.ArrayList;

public class Positionofelement {

	public static void main(String[] args) {
		ArrayList<String> names= new ArrayList<String>();
		names.add("Sai");
		names.add("Santhu");
		names.add("Siri");
		names.add("Srihan");
		names.add("Chintu");
		System.out.println("Position of element is: "+names.indexOf("Srihan"));
		System.out.println(names.get(4));
		

	}

}
