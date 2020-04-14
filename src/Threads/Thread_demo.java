package Threads;
	class Thread_demo implements Runnable{
		String sName;
		
		Thread myThread;
		public Thread_demo(String name)
		{
			this.sName=name;
		}



	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread Name "+sName+" count "+i);
			try {
				Thread.sleep(1000);
				
			} 
			catch (Exception e) {
		
				System.out.println("Thread is inteerupted "+e);
			}
		}
		
	}
	public  void startThread()
	{
		System.out.println("Thread started "+sName);
		if(myThread==null)
		{
			myThread=new Thread(this,sName);
			myThread.start();
		}
		
	}
	 static class SampleThread {
			public static void main(String[] args) 
			{
				Thread_demo thread1=new Thread_demo("Thread one");
				Thread_demo thread2=new Thread_demo("Thread two");
			     thread1.startThread();
			     thread2.startThread();
			     

				
			}
			
		}

	}

