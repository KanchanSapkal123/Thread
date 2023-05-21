package com.Thread;

class Sync extends Thread
{

 public void printTable(int n) 
{
	 synchronized(this) 
	 { 
		 for(int i=1;i<=10;i++) 
		{
			System.out.println(n*i);
		}
	 }
 }

	 
}


class MyT extends Thread
{
	
	Table t1;
	
	MyT(Table t1)
	{
		this.t1=t1;
	}
	
	 public MyT() {
		// TODO Auto-generated constructor stub
	}

	public void run()
	{
		 t1.printTable(5);	
	}
}



public class Synchronizedblock {

	public static void main(String[] args) {
	
		Sync s=new Sync();
		s.printTable(6);
		
		MyT t=new MyT();
		t.run();
		
		s.start();
		t.start();
		
	}

}
