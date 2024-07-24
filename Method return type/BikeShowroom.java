class BikeShowroom{
public static void main(String[] args){

      double insurance=10000.00;
	  double servicefee=50000.00;
	  double gst=18000.00;
	  
	  String bike="ns";
	  if(bike=="ns"){
	  double nsprice=200000.00;
	  double ref1= nsprice +insurance+servicefee+gst;
	  
	  System.out.println("total bill:" +ref1);
	  }
       else if(bike=="honda"){
	   double hondaprice=100000.00;
	   double ref2=hondaprice +insurance+servicefee+gst;
	   System.out.println("total bill:" +ref2);
	   
	   }
	   
	   else{
	   
	   System.out.println("not available");
	   
	   
	   }
	   
	   
}

}