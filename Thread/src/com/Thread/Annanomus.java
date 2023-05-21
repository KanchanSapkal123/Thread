package com.Thread;

 abstract class B extends Thread
{
	
	abstract public void run();
	
}

public class Annanomus {

	public static void main(String[] args) 
	{
	B a=new B()
			{

				@Override
				public void run()
				{
					
					System.out.println("This is the Annanomus class");
				}
		
			};
		a.run();

	}

}



 