package inheritance_programme;

class Set_URL
{
	 Set_URL()
	{
		System.out.println("Set the URL of the application");   //Super calling statement with out parameter.
	}
}

class Launch_the_Browser extends Set_URL
{
	Launch_the_Browser()
	{
		System.out.println("Please launch the Browser");
	}
}

public class Testcase1 extends Launch_the_Browser    //super class with non parameterized.
{
   
	Testcase1()
	{
		super();  //super calling statement can be written or can not be written for non parameterized constructors.
		System.out.println("Testcase to automate");
	}
    
	public static void main(String[] args) 
	{
		Testcase1 t1=new Testcase1();
		
			
		
	}
}
