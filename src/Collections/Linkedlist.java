package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            /* int[] arr= {1,2,3};
             for(int i=0;i<arr.length;i++)
             {
            	 System.out.println(arr[i]);
             }*/
             
             LinkedList<Integer> llist=new LinkedList<>();
             llist.add(2);
             llist.add(4);
             llist.add(5);
             llist.add(8);
             llist.add(4);
             llist.add(8);
            // llist.add(null);
             llist.add(2, 13);
             llist.remove(1);
             //llist.remove();
             for(int i=0;i<llist.size();i++)
             {
            	 System.out.println("elements in linked list is "+llist.get(i));
             }
             System.out.println("4th index elements is "+llist.get(4));
            
             
             
            /* Iterator<Integer> it1=llist.iterator();
             System.out.println(it1.next());
             System.out.println(it1.next());
             System.out.println(it1.next());
             
             */
             
            /*Iterator<Integer> it=llist.iterator();
            while(it.hasNext())
            {
           	 System.out.println("Item in list is "+it.next());
             }*/
             
            Collections.sort(llist);
            {
            	
            	Iterator<Integer> it=llist.iterator();
                while(it.hasNext())
                {
               	 System.out.println("Item in list is "+it.next());
                 }
            }
	}

}
