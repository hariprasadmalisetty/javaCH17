

public class MyName {

    public static void main(String[] args) {
        String myName = "hari";
        
        System.out.println("Running states in MyName");

        String reversedName = "";
        for (int i = myName.length() - 1; i >= 0; i--) {
            reversedName += myName.substring(i, i + 1);
        }

        System.out.print(reversedName);
        System.out.println("\nEnd states in MyName");
    }
}
