class Paint{
	
	public static void purchase(String brand){
		
		System.out.println("Running a method with string prameters");
		System.out.println("Brand="+brand);
	}
	public static void purchase(String brand,String color){
		
		System.out.println("Running a method with two string parameters");
		System.out.println("Brand="+brand);
		System.out.println("Color="+color);
		
	}
	public static void purchase(String brand, double price){
		
		System.out.println("Running a method with string and double parameters");
		System.out.println("Brand="+brand);
		System.out.println("Price="+price);
		
	}
	public static void purchase(String color, String type, double price){
		
		System.out.println("Running a method with string, string and double parameters");
		System.out.println("Color="+color);
		System.out.println("Type="+type);
		System.out.println("Price="+price);
	}