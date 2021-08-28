
class Demo6 extends Thread
{  
    public void run()
	{  
	System.out.println("Shutdown hook task is Now completed...");  
	}  
}  

public class ShutdownDemo1
{  
	public static void main(String[] args)throws Exception 
	{  

		Runtime obj=Runtime.getRuntime();  
		obj.addShutdownHook(new Demo6());  
		System.out.println("Now main method is sleeping... For Exit press ctrl+c");  
		try
		{
			Thread.sleep(4000);
		}
		catch (Exception e) {}  
	}  
}  
	