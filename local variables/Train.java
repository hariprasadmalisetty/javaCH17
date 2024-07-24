class Train{
	
	public static void apply(String source, String destination){
		
		System.out.println("Running a method with two string parameters");
		System.out.println("source="+source);
		System.out.println("Destination="+destination);	
	}
	
	public static void apply(String source, String destination, int quantity){
		
		System.out.println("Running a method with two string and one byte parameters");
		System.out.println("source="+source);
		System.out.println("Destination="+destination);
		System.out.println("Quantity="+quantity);
	}
	
	public static void apply(String source, String destination, int quantity, double price){
		
		System.out.println("Running a metthod with two string, one int and one double");
		System.out.println("source="+source);
		System.out.println("Destination="+destination);
		System.out.println("Quantity="+quantity);
		System.out.println("Price="+price);
	}
	
	public static void cancel(int ticketNo){
		
		System.out.println("Running a method with int parameters");
		System.out.println("Ticket Number="+ticketNo);
	
	}
	
	public static void cancel(String source, String destination){
		
		System.out.println("Running a method with two string parameters");
		System.out.println("source="+source);
		System.out.println("Destination="+destination);
	}
	
}