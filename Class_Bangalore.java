package inheritance_programme;

class Delhi
{
	static void add()
	{
		int a=60;
		int b=50;
		int sum =a+b;
		System.out.println("value of Delhi="  +sum);
	}
}

class chennai extends Delhi
{
	static void subtract()
	{
		int a=60;
		int b=50;
		int sub =a-b;
		System.out.println("value of Chennai="  +sub);
	}
	
}


public class Class_Bangalore extends chennai
{

	static void mul()
	{
		int a=60;
		int b=50;
		int mul =a*b;
		System.out.println("value of Bangalore="  +mul);
	}
	
	public static void main(String[] args) 
	{
		add();
		subtract();
		mul();
	}
}
