package inheritance_programme;

class Sushri
{
	void add()
	{
		int a=4;
		int b=10;
		int sum=a+b;
		System.out.println("Addition of a and b ="+sum);
	}
}
public class Child_class_inheritance_nonstatic extends Sushri
{

	void subtract()
	{
		int a=4;
		int b=10;
		int sub=a-b;
		System.out.println("Subtraction of a and b ="+sub);
	}
	
	public static void main(String[] args) 
	{
		Child_class_inheritance_nonstatic c1=new Child_class_inheritance_nonstatic();
		c1.add();
		c1.subtract();
		
	}
	
}
