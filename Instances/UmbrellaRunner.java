class UmbrellaRunner{
    public static void main(String[] args) {
        Umbrella u1=new Umbrella("SkyBrella", "Red", 90, 120, true, true, "Fabric", 1.2, 25, "Automatic");
        Umbrella u2=new Umbrella("RainSafe", "Blue", 85, 110, false, false, "Nylon", 1.0, 20, "Manual");
        Umbrella u3=new Umbrella("StormShield", "Black", 95, 130, true, true, "Polyester", 1.5, 30, "Automatic");

        u1.showMethod();
        u2.showMethod();
        u3.showMethod();
    }
}