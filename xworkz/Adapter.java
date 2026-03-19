class Adapter {

    public static void main(String[] args){

        int watt = 65;
        double price = 999.99;
        float output = 19.5f;
        char model = 'X';
        boolean original = true;

        System.out.println("watt: " + watt);
        System.out.println("price: " + price);
        System.out.println("output: " + output);
        System.out.println("model: " + model);
        System.out.println("original: " + original);

        watt = 45;
        price = 799.50;
        output = 18.0f;
        model = 'Y';
        original = false;

        System.out.println("\n\nAfter Update");
        System.out.println("watt: " + watt);
        System.out.println("price: " + price);
        System.out.println("output: " + output);
        System.out.println("model: " + model);
        System.out.println("original: " + original);
    }
}