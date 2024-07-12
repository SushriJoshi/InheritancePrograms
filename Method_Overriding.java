package inheritance_programme;

class Parent_method
{
	void login()
	{
		System.out.println("Login with mobile number.");
	}
}

public class Method_Overriding extends Parent_method
{

	void login()
	{
		System.out.println("Login with email ID");
	}
	
	public static void main(String[] args) 
	{
		Method_Overriding m1=new Method_Overriding();
		m1.login();
	}
}
