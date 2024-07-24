 class Animal {
    public static void dog1() {
        System.out.println("This is dog1");
        dog1();
    }

    public static void main(String[] args) {
        dog1();
    }
}
