package Collections;
import java.util.*;
//import java.util.Queue;
//import java.util.LinkedList;

public class QueueCollection {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();//queue is FIFO
	
		q.add("siri");
		q.add("srihan");
		q.add("chintu");
		q.add("santhu");
		
		int qsize=q.size();
		for(int i=0;i<qsize;i++)
		{
			 System.out.println(q.size());
			System.out.println(q.poll());//poll is for queue
			//System.out.println(q.peek());
			 //System.out.println(q.size());
			
		  
		}

	}

}
