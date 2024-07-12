package inheritance_programme;

public class This_CallingStatement 
{

	This_CallingStatement(int a)
	{
		System.out.println("Please print 1.");
	}
	
	This_CallingStatement(int a,int b)
	{
		this(100);   //this calling statement can only written in the first line of the constructor.It is used to call int a.
		System.out.println("Please print 2.");
	}
	
	This_CallingStatement(int a,double d)
	{
		this(100,200);   //It is used to call int a, int b
		System.out.println("Please print 3.");
	}
	
	public static void main(String[] args) 
	{
		new This_CallingStatement(300,5.63);  //Constructor is created. It is used to call int a, double b
	}
}
