class ChargerRunner
{
	public static void main(String[] args)
	{
		Charger charger=new Charger();
		int watt=charger.chargerWatt;
		String brand=charger.chargerBrand;
		String color=charger.color;
		
		System.out.println("Charger Watt:"+watt);
		System.out.println("Brand:"+brand);
		System.out.println("color:"+color);
		
		Charger charger1=new Charger();
		int watts=charger.chargerWatt;
		String logo=charger.chargerBrand;
		String clour=charger.color;
		
		charger.chargerWatt=100;
		charger.chargerBrand="flash wolt";
		String ref=charger.color;
		
		System.out.println("Watt:"+charger.chargerWatt);
		System.out.println("Brand:"+charger.chargerBrand);
		System.out.println("color:"+charger.color);
          }

}