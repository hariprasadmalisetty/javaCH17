class PersonRunner1
{
	public static void main(String[] information)
	{

	    if (information.length==4)
		{
		    System.out.println("getting four from main method");
		    String name=information[0];
		    String email=information[1];
		    String age=information[2];
		    String password=information[3];
		
		    System.out.println("name:"+name);
		    System.out.println("email:"+email);
		    System.out.println("age:"+age);
		    System.out.println("password:"+password);
		}
		else
		{
		System.out.println("getting four from main method in the person");
		}
		
	}
	
	
}