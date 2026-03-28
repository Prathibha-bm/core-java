class CupInfo{
	
	public static void main(String[] args){
		Cup instance1=new Cup();
		Cup instance2=new Cup();
		Cup instance3=new Cup();
		Cup instance4=new Cup();
		Cup instance5=new Cup();

        System.out.println("\n--- Default Values ---");

        System.out.println("\nInstance1");
        System.out.println("Color: " + instance1.color);
        System.out.println("Height: " + instance1.height);
        System.out.println("Diameter: " + instance1.diameter);
        System.out.println("Price: " + instance1.price);
        System.out.println("Glass: " + instance1.glass);

        System.out.println("\nInstance2");
        System.out.println("Color: " + instance2.color);
        System.out.println("Height: " + instance2.height);
        System.out.println("Diameter: " + instance2.diameter);
        System.out.println("Price: " + instance2.price);
        System.out.println("Glass: " + instance2.glass);

        System.out.println("\nInstance3");
        System.out.println("Color: " + instance3.color);
        System.out.println("Height: " + instance3.height);
        System.out.println("Diameter: " + instance3.diameter);
        System.out.println("Price: " + instance3.price);
        System.out.println("Glass: " + instance3.glass);

        System.out.println("\nInstance4");
        System.out.println("Color: " + instance4.color);
        System.out.println("Height: " + instance4.height);
        System.out.println("Diameter: " + instance4.diameter);
        System.out.println("Price: " + instance4.price);
        System.out.println("Glass: " + instance4.glass);

        System.out.println("\nInstance5");
        System.out.println("Color: " + instance5.color);
        System.out.println("Height: " + instance5.height);
        System.out.println("Diameter: " + instance5.diameter);
        System.out.println("Price: " + instance5.price);
        System.out.println("Glass: " + instance5.glass);

        // Assign values for each instance
        instance1.color = "Blue";
        instance1.height = 10.4;
        instance1.diameter = 5.6;
        instance1.price = 500;
        instance1.glass = true;

        instance2.color = "Red";
        instance2.height = 12.0;
        instance2.diameter = 6.2;
        instance2.price = 600;
        instance2.glass = false;

        instance3.color = "Green";
        instance3.height = 9.8;
        instance3.diameter = 5.0;
        instance3.price = 450;
        instance3.glass = true;

        instance4.color = "Yellow";
        instance4.height = 11.5;
        instance4.diameter = 6.0;
        instance4.price = 550;
        instance4.glass = false;

        instance5.color = "White";
        instance5.height = 10.0;
        instance5.diameter = 5.5;
        instance5.price = 480;
        instance5.glass = true;

        System.out.println("\n--- Updated Values ---");

        System.out.println("\nInstance1");
        System.out.println("Color: " + instance1.color);
        System.out.println("Height: " + instance1.height);
        System.out.println("Diameter: " + instance1.diameter);
        System.out.println("Price: " + instance1.price);
        System.out.println("Glass: " + instance1.glass);

        System.out.println("\nInstance2");
        System.out.println("Color: " + instance2.color);
        System.out.println("Height: " + instance2.height);
        System.out.println("Diameter: " + instance2.diameter);
        System.out.println("Price: " + instance2.price);
        System.out.println("Glass: " + instance2.glass);

        System.out.println("\nInstance3");
        System.out.println("Color: " + instance3.color);
        System.out.println("Height: " + instance3.height);
        System.out.println("Diameter: " + instance3.diameter);
        System.out.println("Price: " + instance3.price);
        System.out.println("Glass: " + instance3.glass);

        System.out.println("\nInstance4");
        System.out.println("Color: " + instance4.color);
        System.out.println("Height: " + instance4.height);
        System.out.println("Diameter: " + instance4.diameter);
        System.out.println("Price: " + instance4.price);
        System.out.println("Glass: " + instance4.glass);

        System.out.println("\nInstance5");
        System.out.println("Color: " + instance5.color);
        System.out.println("Height: " + instance5.height);
        System.out.println("Diameter: " + instance5.diameter);
        System.out.println("Price: " + instance5.price);
        System.out.println("Glass: " + instance5.glass);
    }
}