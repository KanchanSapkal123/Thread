package com.Thread;

public class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(
			Thread.currentThread().getName());
		    //System.out.println(currentThread().getName()+" "
	//	+i
	/*	+" "+currentThread().getId()
		+" "+currentThread().getPriority()
		*/
	//				);
			
			
			if(i==5)
			{
				yield();
			}
			
			 try { 
				 sleep(1000);
			 }
			catch(InterruptedException e) {
				
				e.printStackTrace();
			}	
		}	
	}
	public static void main(String[] args) throws InterruptedException {
	
		MyThread1 t1=new MyThread1();
		
		MyThread1 t2=new MyThread1();
		
		MyThread1 t3=new MyThread1();
		
		
		
		t1.start();
//		t1.getId();
		
//		t1.join();
		
		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");
		
		t1.join(2000);

		t2.start();
		t2.getId();
		
		t3.start();
	/*	
		t1.setPriority(2);
		t2.setPriority(9);
		*/
	}

}