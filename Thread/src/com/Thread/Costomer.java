package com.Thread;

class TestCustomer
{

	int amount = 10000;
	
	synchronized public void withdrow(int amount)
	{
		System.out.println("Going to withdrow");
		
		
		if(this.amount <amount)
			
		{
			System.out.println("Less balance : waiting for deposit ....");
		}
		try
		{
			wait();
		}
		catch(Exception e)
		{
			
		}
		this.amount-=amount;
		if(this.amount>0)
		{
			System.out.println("withdrow completed");
		}
		else {
			System.out.println("not completed");
		}
	}
	synchronized public void diposit(int amount)
	{
		System.out.println("going to deposite.... ");
		
		this.amount+=amount;
		
		System.out.println("deposite completed");
		notify();
	}		
}


public class Costomer {

	public static void main(String[] args) {
	
		final TestCustomer c=new TestCustomer();
		new Thread()
		{
			
			public void run() {
			c.withdrow(30000);
			}
			
		}.start();
		new Thread() {
			public void run() {
				c.diposit(10000);
			}
		}.start();

	}
}


