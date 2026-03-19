class IceCream {

    public static void main(String[] args){

        int scoops = 2;
        double price = 80.50;
        float temperature = -5.5f;
        char flavorCode = 'V';
        boolean hasNuts = true;

        System.out.println("scoops: " + scoops);
        System.out.println("price: " + price);
        System.out.println("temperature: " + temperature);
        System.out.println("flavorCode: " + flavorCode);
        System.out.println("hasNuts: " + hasNuts);

        scoops = 3;
        price = 120.75;
        temperature = -6.0f;
        flavorCode = 'C';
        hasNuts = false;

        System.out.println("\n\nAfter Update");
        System.out.println("scoops: " + scoops);
        System.out.println("price: " + price);
        System.out.println("temperature: " + temperature);
        System.out.println("flavorCode: " + flavorCode);
        System.out.println("hasNuts: " + hasNuts);
    }
}