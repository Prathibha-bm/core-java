class MainWindShield{
    public static void main(String[] args) {
        WindShield w1 = new WindShield();
        WindShield w2 = new WindShield("Guardian");
        WindShield w3 = new WindShield( "gold",125, 62);
		WindShield w4 = new WindShield(0.85, 220, true);
		WindShield w5 = new WindShield( false, "Truck");


        w1.showMethod();
        w2.showMethod();
        w3.showMethod();
	    w4.showMethod();
		w5.showMethod();
    }
}