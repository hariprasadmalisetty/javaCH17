class MedicineRunner {
    public static void main(String[] args) {
        System.out.println("running main in MedicineRunner");

        if (args.length == 4) {
            String name = args[0];
            String manfdate = args[1];
            String price = args[2];
            String quantity = args[3];
            
            double convertedPrice = Double.parseDouble(price);
            int convertedQuantity = Integer.parseInt(quantity);
            
            Medicine.drug(name, manfdate, convertedPrice, convertedQuantity);
        } else {
            System.out.println("required 4 arguments");
        }
    }
}
