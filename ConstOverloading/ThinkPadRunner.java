class ThinkPadRunner{
	
    public static void main(String[] args) {
		
        ThinkPad tp1 = new ThinkPad();
        ThinkPad tp2 = new ThinkPad("T14");
		ThinkPad tp3 = new ThinkPad( 2.0, 2000, true);
		ThinkPad tp4 = new ThinkPad("P15", "Lenovo", 15.6);
		ThinkPad tp5 = new ThinkPad(32, 1024);
       

        tp1.showMethod();
        tp2.showMethod();
        tp3.showMethod();
		tp4.showMethod();
		tp5.showMethod();
    }
}