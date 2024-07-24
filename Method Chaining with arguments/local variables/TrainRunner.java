class TrainRunner
{ 
    public static void main(String[] args)
	{
	System.out.println("Running main method in Train Runner");
		Train.apply("Jolarpettai","Hoodi");
		
		Train.apply("Jolarpettai","Hoodi",25);
		
		Train.apply("Jolarpettai","Hoodi",25, 85.0);
		
		Train.cancel(567135);
		
		Train.cancel("Jolarpettai","Hoodi");
}
	}