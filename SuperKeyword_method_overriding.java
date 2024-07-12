package inheritance_programme;

class ParentClass_Method
{
	void login()
	{
		System.out.println("Login with mobile number.");
	}
}

public class SuperKeyword_method_overriding extends ParentClass_Method
{

	void login()
	{
//		super.login();    Super keyword can be written in any line
		System.out.println("Login with email ID.");
		super.login();
	}
	
	public static void main(String[] args) 
	{
		SuperKeyword_method_overriding s1=new SuperKeyword_method_overriding();
		s1.login();
	}
}
