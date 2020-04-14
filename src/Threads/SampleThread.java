package Threads;

public class SampleThread {
	public  static void main(String[] args) 
	{
		Thread_demo thread1=new Thread_demo("Thread one");
		Thread_demo thread2=new Thread_demo("Thread two");
	     thread1.startThread();
	     thread2.startThread();
	     

		
	}
	
}

