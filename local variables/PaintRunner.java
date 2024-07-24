class PaintRunner
{
public static void main(String[] args)
{
		System.out.println("Running main method in paint Runner");
		
		Paint.purchase("Nippon Paints");
		Paint.purchase("Nippon Paints","Blue");
		
		Paint.purchase("Nippon Paints",12534.4);
		
		Paint.purchase("Blue","Arcylic",12534.4);
}
}