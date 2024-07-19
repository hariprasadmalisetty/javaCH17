class ForestRunner
{
	public static void main(String[] information)
	{

	    if (information.length==4)
		{
		    System.out.println("getting four from main method"); 
		    String name=information[0];
		    String area=information[1];
		    String establishedYear=information[2];
		    String state=information[3];
		
		    System.out.println("name:"+name);
		    System.out.println("area:"+area);
		    System.out.println("establishedYear:"+establishedYear);
		    System.out.println("state:"+state);
		}
		else
		{
		System.out.println("getting four from main method in the person");
		}
		
	}
	
	
}