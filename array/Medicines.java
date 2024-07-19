
public class Medicines {
    public static void drug(String[] args) {
        if (args.length == 4) {
            String name = args[0];
            String manudate = args[1];
            String price = args[2];
            String quality = args[3];
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
                Date convertedManuDate = sdf.parse(manudate);
                int convertedPrice = Integer.parseInt(price);
                boolean convertedQuality = Boolean.parseBoolean(quality);                
                
  
                Medicine medicine = new Medicine();
                medicine.drug(name, convertedManuDate, convertedPrice, convertedQuality);
            } catch (ParseException | NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String[] exampleData = { "Aspirin", "20230715", "500", "true" };
        Medicines.drug(exampleData);
    }
}

class Medicine {
    public void drug(String name, Date manudate, int price, boolean quality) {
        // Implementation of the drug method
        System.out.println("Name: " + name);
        System.out.println("Manufacturing Date: " + manudate);
        System.out.println("Price: " + price);
        System.out.println("Quality: " + quality);
    }
}
