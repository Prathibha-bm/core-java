class InkPadRunner{
    public static void main(String[] args) {

     
        InkPad i1 = new InkPad("Camlin", "Blue", 10, 5, 50, true, "Plastic", true, "Rectangle", 0.2);
        InkPad i2 = new InkPad("Dollar", "Black", 12, 6, 60, false, "Metal", true, "Square", 0.3);
        InkPad i3 = new InkPad("Faber-Castell", "Red", 11, 5.5, 55, true, "Wood", false, "Rectangle", 0.25);
		
        i1.showMethod(); 
		i2.showMethod(); 
		i3.showMethod();
		}
		}