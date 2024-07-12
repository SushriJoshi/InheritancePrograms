package inheritance_programme;

class Sahil
{
	Sahil(int a)
	{
		System.out.println("Set the URL");
	}
}

class Swati extends Sahil
{
	Swati(String b)
	{
		super(100);
		System.out.println("Please Launch_the_Browser");
	}
}

public class Super_Calling_withPara extends Swati
{

	Super_Calling_withPara(int a,double b)
	{
		super("GoogleChrome");
		System.out.println("Please automate the super calling statement");
	}
	
	public static void main(String[] args) 
	{
		new Super_Calling_withPara(100,3.25);
		
	}
	
}
