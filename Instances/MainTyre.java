class MainTyre{
    public static void main(String[] args) {
        Tyre2 t1 = new Tyre2("Michelin", 16, 205, "All-Season", 120, true, "Rubber", 15, "Car", true);
        Tyre2 t2 = new Tyre2("Bridgestone", 18, 225, "Winter", 150, true, "Rubber", 18, "SUV", false);
        Tyre2 t3 = new Tyre2("Goodyear", 17, 215, "Summer", 130, false, "Rubber", 16, "Car", true);

        t1.showMethod();
        t2.showMethod();
        t3.showMethod();
    }
}