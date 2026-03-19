class Extension {
	public static void main(String[] args){

        int sockets = 4;
        double price = 450.50;
        float length = 2.5f;
        char type = 'H';
        boolean surgeProtection = true;

        System.out.println("sockets: " + sockets);
        System.out.println("price: " + price);
        System.out.println("length: " + length);
        System.out.println("type: " + type);
        System.out.println("surgeProtection: " + surgeProtection);

        sockets = 6;
        price = 600.75;
        length = 3.0f;
        type = 'V';
        surgeProtection = false;

        System.out.println("\n\nAfter Update");
        System.out.println("sockets: " + sockets);
        System.out.println("price: " + price);
        System.out.println("length: " + length);
        System.out.println("type: " + type);
        System.out.println("surgeProtection: " + surgeProtection);
    }
}