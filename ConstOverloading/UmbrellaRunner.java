class UmbrellaRunner{
    public static void main(String[] args) {
        Umbrella u1=new Umbrella();
        Umbrella u2=new Umbrella("RainSafe");
        Umbrella u3=new Umbrella("Black", 95);
		Umbrella u4=new Umbrella(130, true, true);
		Umbrella u5=new Umbrella( "Polyester", 1.5, 30, "Automatic");

        u1.showMethod();
        u2.showMethod();
        u3.showMethod();
		u4.showMethod();
		u5.showMethod();
    }
}