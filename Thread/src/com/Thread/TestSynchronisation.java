package com.Thread;

class Table 
{

synchronized public void printTable(int n) 
{
	for(int i=1;i<=10;i++) 
		{
			System.out.println(n*i);
		}
 }	 
}
class MyThred1 extends Thread
{
	
	Table t1;
	
	MyThred1(Table t1)
	{
		this.t1=t1;
	}
	
	 public void run()
	{
		 t1.printTable(5);	
	}
}

class MyThread13 extends Thread{
	
	Table t2;
	MyThread13(Table t2)
	{
		this.t2=t2;
	}
	
	public void run()
	{
		t2.printTable(6);
	}
}
public class TestSynchronisation {
	
	public static void main(String[] args) {

		Table t=new Table();
		t.printTable(2);
		
		MyThread1 t1=new MyThread1();
		MyThread13 t2=new MyThread13(t);
		
		t1.start();
		t2.start();
	}
}