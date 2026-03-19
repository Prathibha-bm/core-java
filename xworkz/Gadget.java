class Gadget {

    public static void main(String[] args){

        int battery = 80;
        double price = 2500.75;
        float version = 2.1f;
        char category = 'E';
        boolean smart = true;

        System.out.println("battery: " + battery);
        System.out.println("price: " + price);
        System.out.println("version: " + version);
        System.out.println("category: " + category);
        System.out.println("smart: " + smart);

        battery = 60;
        price = 1999.99;
        version = 3.0f;
        category = 'H';
        smart = false;

        System.out.println("\n\nAfter Update");
        System.out.println("battery: " + battery);
        System.out.println("price: " + price);
        System.out.println("version: " + version);
        System.out.println("category: " + category);
        System.out.println("smart: " + smart);
    }
}