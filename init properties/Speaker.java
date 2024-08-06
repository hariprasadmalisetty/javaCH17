 class Speaker{
   String brand;
   String size;
   double cost=1000;
   String output;
   
   void display()
   {
	   System.out.println("Brand:"+this.brand);
	   System.out.println("Size:"+this.size);
	    System.out.println("cost:"+this.cost);
		System.out.println("output:"+this.output);
		
	   
   }
   
   Speaker(String output)
   {
	   this.output=output;
   }
   public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	public void setSize(String size)
	{
		this.size=size;
	}
	
	
}
 class SpeakerRunner
{
   public static void main(String[] args)
   {   System.out.println("Staring the first Brand");
   Speaker speaker=new Speaker("simple");
   speaker.brand="Boat";
   speaker.setSize("BIG");
   speaker.display();
   
   System.out.println("Staring the second Brand");
   Speaker speaker1=new Speaker("Base");
   speaker1.brand="JBL";
   speaker1.setSize("BIG");
   speaker1.display();
   
   System.out.println("Staring the third Brand");
   Speaker speaker2=new Speaker("normal");
   speaker2.brand="sony";
   speaker2.setSize("small");
   speaker2.display();
   }
}