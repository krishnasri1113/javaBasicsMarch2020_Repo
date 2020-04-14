package Collections;

import java.util.Stack;

public class stackcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s=new Stack<String>();//Stack is for FILO
		s.add("siri");
		s.add("srihan");
		s.add("chintu");
		s.add("santhu");
		
		int qsize=s.size();
		for(int i=0;i<qsize;i++)
		{
			
			//System.out.println(s.peek());
			System.out.println(s.size());
			System.out.println(s.pop());//pop is for stack
			//System.out.println(s.size());

		}

	}


	}


