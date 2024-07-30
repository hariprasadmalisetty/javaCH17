class ClawClipRunner
{
	public static void main(String[] args)
	{
		clawClip clawclip= new clawClip();
		String clip=clawclip.name;
		int qty=clawclip.quantity;
		double cost=clawclip.price;
		
		System.out.println("Name: "+clawclip.name);
		System.out.println("quantity: "+clawclip.quantity);
		System.out.println("price: "+clawclip.price);
		
		clawClip clawclip1= new clawClip();
		String clips=clawclip.name;
		int quty=clawclip.quantity;
		double prc=clawclip.price;
		
		String per=clawclip.name;
		clawclip.quantity=5;
		clawclip.price=25;
		
		System.out.println("name:"+clawclip.name);
		System.out.println("Quantity: "+clawclip.quantity);
		System.out.println("Price: "+clawclip.price);
          }

}