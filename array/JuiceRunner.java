class JuiceRunner
{
   public static void main(String[]args)
   {
      System.out.println("Running main in JuiceRunner");
      if(args.length==5)
      {
      String name=args[0];
      String brand=args[1];
      String flavour=args[2];
      String price=args[3];
      String quantity=args[4];
      double convertedprice= Double.parseDouble(price);
      int convertedQuantity= Integer.parseInt(quantity);
      Juice.mixer(name,brand,flavour,convertedprice,convertedQuantity);
   	 }
	 else
	  {
	  System.out.println("ending of the juicerunner");
	  }	
   }
}