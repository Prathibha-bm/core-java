class CapRunner{

	public static void main(String[] args){
		Cap instance1=new Cap();
		Cap instance2=new Cap();
		Cap instance3=new Cap();
		Cap instance4=new Cap();
		Cap instance5=new Cap();
		
        System.out.println("\n--- Default Values ---");

        System.out.println("\nInstance1");
        System.out.println("Number: " + instance1.number);
        System.out.println("Type: " + instance1.type);
        System.out.println("Size: " + instance1.size);
        System.out.println("Color: " + instance1.color);
        System.out.println("Price: " + instance1.price);

        System.out.println("\nInstance2");
        System.out.println("Number: " + instance2.number);
        System.out.println("Type: " + instance2.type);
        System.out.println("Size: " + instance2.size);
        System.out.println("Color: " + instance2.color);
        System.out.println("Price: " + instance2.price);

        System.out.println("\nInstance3");
        System.out.println("Number: " + instance3.number);
        System.out.println("Type: " + instance3.type);
        System.out.println("Size: " + instance3.size);
        System.out.println("Color: " + instance3.color);
        System.out.println("Price: " + instance3.price);

        System.out.println("\nInstance4");
        System.out.println("Number: " + instance4.number);
        System.out.println("Type: " + instance4.type);
        System.out.println("Size: " + instance4.size);
        System.out.println("Color: " + instance4.color);
        System.out.println("Price: " + instance4.price);

        System.out.println("\nInstance5");
        System.out.println("Number: " + instance5.number);
        System.out.println("Type: " + instance5.type);
        System.out.println("Size: " + instance5.size);
        System.out.println("Color: " + instance5.color);
        System.out.println("Price: " + instance5.price);

        instance1.number = 1001;
        instance1.type = "Bottle Cap";
        instance1.size = "M";
        instance1.color = "Black";
        instance1.price = 4.5;

        instance2.number = 1002;
        instance2.type = "Snapback Cap";
        instance2.size = "L";
        instance2.color = "Blue";
        instance2.price = 6.0;

        instance3.number = 1003;
        instance3.type = "Baseball Cap";
        instance3.size = "XL";
        instance3.color = "Red";
        instance3.price = 5.2;

        instance4.number = 1004;
        instance4.type = "Trucker Cap";
        instance4.size = "S";
        instance4.color = "White";
        instance4.price = 3.8;

        instance5.number = 1005;
        instance5.type = "Sports Cap";
        instance5.size = "M";
        instance5.color = "Grey";
        instance5.price = 4.8;

        System.out.println("\n--- Updated Values ---");

        System.out.println("\nInstance1");
        System.out.println("Number: " + instance1.number);
        System.out.println("Type: " + instance1.type);
        System.out.println("Size: " + instance1.size);
        System.out.println("Color: " + instance1.color);
        System.out.println("Price: " + instance1.price);

        System.out.println("\nInstance2");
        System.out.println("Number: " + instance2.number);
        System.out.println("Type: " + instance2.type);
        System.out.println("Size: " + instance2.size);
        System.out.println("Color: " + instance2.color);
        System.out.println("Price: " + instance2.price);

        System.out.println("\nInstance3");
        System.out.println("Number: " + instance3.number);
        System.out.println("Type: " + instance3.type);
        System.out.println("Size: " + instance3.size);
        System.out.println("Color: " + instance3.color);
        System.out.println("Price: " + instance3.price);

        System.out.println("\nInstance4");
        System.out.println("Number: " + instance4.number);
        System.out.println("Type: " + instance4.type);
        System.out.println("Size: " + instance4.size);
        System.out.println("Color: " + instance4.color);
        System.out.println("Price: " + instance4.price);

        System.out.println("\nInstance5");
        System.out.println("Number: " + instance5.number);
        System.out.println("Type: " + instance5.type);
        System.out.println("Size: " + instance5.size);
        System.out.println("Color: " + instance5.color);
        System.out.println("Price: " + instance5.price);
    }
}