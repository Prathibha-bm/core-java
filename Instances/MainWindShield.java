class MainWindShield {
    public static void main(String[] args) {
        WindShield w1 = new WindShield("Saint-Gobain", "Glass", 120, 60, 0.8, 200, true, true, "Car", 12);
        WindShield w2 = new WindShield("Guardian", "Tempered Glass", 130, 65, 0.9, 250, false, true, "SUV", 15);
        WindShield w3 = new WindShield("Pilkington", "Glass", 125, 62, 0.85, 220, true, false, "Truck", 18);

        w1.showMethod();
        w2.showMethod();
        w3.showMethod();
    }
}