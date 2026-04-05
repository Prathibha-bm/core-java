class InkPadRunner{
    public static void main(String[] args) {

        InkPad instance1 = new InkPad();
        InkPad instance2 = new InkPad("Dollar");
        InkPad instance3 = new InkPad("Red",56.7);
		InkPad instance4 = new InkPad(11.5, 456.87);
        InkPad instance5 = new InkPad( false, "Rectangle", 0.25);

		
        instance1.showMethod(); 
		instance2.showMethod(); 
		instance3.showMethod();
		instance4.showMethod();
		instance5.showMethod();
		}
		}