package com.Thread;

public class DeadLock {

	String s1="JAVA";
	String s2="UNIX";
	
	Thread t1=new Thread()
	{
		public void run()
		{
			while (true) 
			{
				synchronized(s1)
				{
					synchronized(s2) 
					{
						System.out.println(s1+" "+s2);
					}
				}
			}
		}
	};
	
	Thread t2=new Thread() 
	{
		public void run()
		{
			while (true) 
			{
				synchronized(s1)
				{
					synchronized(s2) 
					{
						System.out.println(s1+" "+s2);
					}
				}
			}
		}
	};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DeadLock d=new DeadLock();
		d.t1.start();
		d.t2.start();
		
		
		
	}

}
