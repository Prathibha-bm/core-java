class FlagRunner{

	public static void main(String[] args){
		Flag var1=new Flag();
		Flag var2=new Flag();
		Flag var3=new Flag();
		Flag var4=new Flag();
		Flag var5=new Flag();

        System.out.println("\n--- Default Values ---");

        System.out.println("\nFlag 1");
        System.out.println("Color: " + var1.color);
        System.out.println("Nation: " + var1.nation);
        System.out.println("Length: " + var1.length);
        System.out.println("Width: " + var1.width);
        System.out.println("Shape: " + var1.shape);

        System.out.println("\nFlag 2");
        System.out.println("Color: " + var2.color);
        System.out.println("Nation: " + var2.nation);
        System.out.println("Length: " + var2.length);
        System.out.println("Width: " + var2.width);
        System.out.println("Shape: " + var2.shape);

        System.out.println("\nFlag 3");
        System.out.println("Color: " + var3.color);
        System.out.println("Nation: " + var3.nation);
        System.out.println("Length: " + var3.length);
        System.out.println("Width: " + var3.width);
        System.out.println("Shape: " + var3.shape);

        System.out.println("\nFlag 4");
        System.out.println("Color: " + var4.color);
        System.out.println("Nation: " + var4.nation);
        System.out.println("Length: " + var4.length);
        System.out.println("Width: " + var4.width);
        System.out.println("Shape: " + var4.shape);

        System.out.println("\nFlag 5");
        System.out.println("Color: " + var5.color);
        System.out.println("Nation: " + var5.nation);
        System.out.println("Length: " + var5.length);
        System.out.println("Width: " + var5.width);
        System.out.println("Shape: " + var5.shape);

        var1.color = "Red";
        var1.nation = "USA";
        var1.length = 6;
        var1.width = 4;
        var1.shape = "Rectangle";

        var2.color = "White";
        var2.nation = "Canada";
        var2.length = 5;
        var2.width = 3;
        var2.shape = "Rectangle";

        var3.color = "Green";
        var3.nation = "India";
        var3.length = 6;
        var3.width = 4;
        var3.shape = "Rectangle";

        var4.color = "Blue";
        var4.nation = "UK";
        var4.length = 7;
        var4.width = 5;
        var4.shape = "Rectangle";

        var5.color = "Yellow";
        var5.nation = "Brazil";
        var5.length = 6;
        var5.width = 4;
        var5.shape = "Rectangle";

        System.out.println("\n--- Updated Values ---");

        System.out.println("\nFlag 1");
        System.out.println("Color: " + var1.color);
        System.out.println("Nation: " + var1.nation);
        System.out.println("Length: " + var1.length);
        System.out.println("Width: " + var1.width);
        System.out.println("Shape: " + var1.shape);

        System.out.println("\nFlag 2");
        System.out.println("Color: " + var2.color);
        System.out.println("Nation: " + var2.nation);
        System.out.println("Length: " + var2.length);
        System.out.println("Width: " + var2.width);
        System.out.println("Shape: " + var2.shape);

        System.out.println("\nFlag 3");
        System.out.println("Color: " + var3.color);
        System.out.println("Nation: " + var3.nation);
        System.out.println("Length: " + var3.length);
        System.out.println("Width: " + var3.width);
        System.out.println("Shape: " + var3.shape);

        System.out.println("\nFlag 4");
        System.out.println("Color: " + var4.color);
        System.out.println("Nation: " + var4.nation);
        System.out.println("Length: " + var4.length);
        System.out.println("Width: " + var4.width);
        System.out.println("Shape: " + var4.shape);

        System.out.println("\nFlag 5");
        System.out.println("Color: " + var5.color);
        System.out.println("Nation: " + var5.nation);
        System.out.println("Length: " + var5.length);
        System.out.println("Width: " + var5.width);
        System.out.println("Shape: " + var5.shape);
    }
}