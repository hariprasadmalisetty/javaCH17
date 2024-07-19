//Declare country class with Below methods

//1. Method to take states: String[] : 29
//2. Methos to take pincode: int[]: 10
//3. Method to take primeminister:String[]: All
//4. Method to take Cabinet ministers:String[]: 30
//5. Method to take political parties:String[]: 5





class India {
    public static void states(String[] states) {
        System.out.println("Start of states");
        for (int no = 0; no < states.length; no++) {
            System.out.println(states[no]);
        }
        System.out.println("End of states");
    }

    public static void pincode(int[] pincodes) {
        System.out.println("Start of pincodes");
        for (int no = 0; no < pincodes.length; no++) {
            System.out.println(pincodes[no]);
        }
        System.out.println("End of pincodes");
    }

    public static void primeMinister(String[] primeMinisters) {
        System.out.println("Start of prime ministers");
        for (int no = 0; no < primeMinisters.length; no++) {
            System.out.println(primeMinisters[no]);
        }
        System.out.println("End of prime ministers");
    }

    public static void cabinetMinisters(String[] cabinetMinisters) {
        System.out.println("Start of cabinet ministers");
        for (int no = 0; no < cabinetMinisters.length; no++) {
            System.out.println(cabinetMinisters[no]);
        }
        System.out.println("End of cabinet ministers");
    }

    public static void politicalParties(String[] politicalParties) {
        System.out.println("Start of political parties");
        for (int no = 0; no < politicalParties.length; no++) {
            System.out.println(politicalParties[no]);
        }
        System.out.println("End of political parties");
    }
}


