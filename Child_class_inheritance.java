package inheritance_programme;

class parentClass
{
	static void add()   //Inheritance with static method.This is the parent class from where child class will inherit it's methods.
	{
	
		int a=4;
		int b=10;
		int sum=a+b;
		System.out.println("Addition of two numbers="+sum);
    }
}
public class Child_class_inheritance extends parentClass
{

	static void subtract()
	{
		int a=4;
		int b=10;
		int sub=b-a;
		System.out.println("Subtraction of two numbers="+sub);
	}

	public static void main(String[] args) 
	{
		add();
		subtract();
		
	}
}
