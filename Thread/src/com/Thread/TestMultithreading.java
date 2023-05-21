package com.Thread;

class Table9
{
	synchronized public void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}	
	}
}


class A extends Thread
{
	Table9 t;
	A(Table9 t)
	{
	
		this.t=t;
	}
	
	public void run() 
	{
		t.printTable(9);
	}
}

public class TestMultithreading {

	public static void main(String[] args) 
	{
		Table9 t=new Table9();
		t.printTable(9);
		
A a=new A(t);
a.start();
	}
}