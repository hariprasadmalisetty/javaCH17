class IndiaRunner {
    public static void main(String[] args) {
        System.out.println("Running India in IndiaRunner");

        String[] states = {
            "andhrapradesh", "telangana", "arunachalpradesh", "assam", "bihar",
            "chhattisgarh", "goa", "gujarat", "haryana", "himachalpradesh",
            "jharkhand", "karnataka", "kerala", "madhyapradesh", "maharashtra",
            "manipur", "meghalaya", "mizoram", "nagaland", "odisha",
            "punjab", "rajasthan", "sikkim", "tamilnadu", "tripura",
            "uttarpradesh", "uttarakhand", "westbengal", "ladakh"
        };

        India.states(states);

        // Example usage of other methods
        int[] pincodes = {110001, 110002, 110003, 110004, 110005, 110006, 110007, 110008, 110009, 110010};
        India.pincode(pincodes);

        String[] primeMinisters = {"Narendra Modi"};
        India.primeMinister(primeMinisters);

        String[] cabinetMinisters = {
            "Rajnath Singh", "Amit Shah", "Nirmala Sitharaman", "Subrahmanyam Jaishankar", "Nitin Gadkari",
            "Smriti Irani", "Prakash Javadekar", "Piyush Goyal", "Dharmendra Pradhan", "Mukhtar Abbas Naqvi",
            "Harsimrat Kaur Badal", "Thawar Chand Gehlot", "Ravi Shankar Prasad", "Harsh Vardhan", "Arjun Munda",
            "Narendra Singh Tomar", "Ramesh Pokhriyal Nishank", "Mahendra Nath Pandey", "Gajendra Singh Shekhawat",
            "Giriraj Singh", "Prahlad Joshi", "Narayan Tatu Rane", "Sarbananda Sonowal", "Ashwini Vaishnaw",
            "Bhupender Yadav", "Parshottam Rupala", "G Kishan Reddy", "Anurag Thakur", "Hardeep Singh Puri", "Mansukh Mandaviya"
        };
        India.cabinetMinisters(cabinetMinisters);

        String[] politicalParties = {"BJP", "INC", "AAP", "CPI", "NCP"};
        India.politicalParties(politicalParties);
    }
}