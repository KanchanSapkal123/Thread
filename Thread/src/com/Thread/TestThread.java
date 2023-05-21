package com.Thread;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Thread is working : ");	
	}
}

public class TestThread {

	public static void main(String[] args) {
	
		MyThread Thread=new MyThread();
		
		Thread.start();

	}

}
