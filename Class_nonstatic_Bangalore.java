package inheritance_programme;

class Hyderabad
{
	 void add()
	{
		int a=60;
		int b=50;
		int sum =a+b;
		System.out.println("value of hyderabad="  +sum);
	}
}

class Bhubaneswar extends Hyderabad
{
	 void subtract()
	{
		int a=60;
		int b=50;
		int sub =a-b;
		System.out.println("value of Bhubaneswar="  +sub);
	}
	
}

public class Class_nonstatic_Bangalore extends Bhubaneswar
{

	 void mul()
		{
			int a=60;
			int b=50;
			int mul =a*b;
			System.out.println("value of Bangalore="  +mul);
		}
	 
	 public static void main(String[] args) 
	 {
		 Class_nonstatic_Bangalore b1=new Class_nonstatic_Bangalore();
		 b1.add();
		 b1.subtract();
		 b1.mul(); 
		
	 }
	
}
