class PowerBankRunner{

	public static void main(String[] args){
		PowerBank instance1=new PowerBank();
		PowerBank instance2=new PowerBank();
		PowerBank instance3=new PowerBank();
		PowerBank instance4=new PowerBank();
		PowerBank instance5=new PowerBank();
		
        System.out.println("\nInstance1");
        System.out.println("Capacity: " + instance1.capacity);
        System.out.println("Name: " + instance1.name);
        System.out.println("ChargingPoints: " + instance1.chargingPoints);
        System.out.println("Color: " + instance1.color);
        System.out.println("Price: " + instance1.price);

        System.out.println("\nInstance2");
        System.out.println("Capacity: " + instance2.capacity);
        System.out.println("Name: " + instance2.name);
        System.out.println("ChargingPoints: " + instance2.chargingPoints);
        System.out.println("Color: " + instance2.color);
        System.out.println("Price: " + instance2.price);

        System.out.println("\nInstance3");
        System.out.println("Capacity: " + instance3.capacity);
        System.out.println("Name: " + instance3.name);
        System.out.println("ChargingPoints: " + instance3.chargingPoints);
        System.out.println("Color: " + instance3.color);
        System.out.println("Price: " + instance3.price);

        System.out.println("\nInstance4");
        System.out.println("Capacity: " + instance4.capacity);
        System.out.println("Name: " + instance4.name);
        System.out.println("ChargingPoints: " + instance4.chargingPoints);
        System.out.println("Color: " + instance4.color);
        System.out.println("Price: " + instance4.price);

        System.out.println("\nInstance5");
        System.out.println("Capacity: " + instance5.capacity);
        System.out.println("Name: " + instance5.name);
        System.out.println("ChargingPoints: " + instance5.chargingPoints);
        System.out.println("Color: " + instance5.color);
        System.out.println("Price: " + instance5.price);

        instance1.capacity = 10000;
        instance1.name = "Zebronics";
        instance1.chargingPoints = 2;
        instance1.color = "Purple";
        instance1.price = 1500;

        instance2.capacity = 15000;
        instance2.name = "Mi";
        instance2.chargingPoints = 3;
        instance2.color = "Black";
        instance2.price = 2000;

        instance3.capacity = 20000;
        instance3.name = "Realme";
        instance3.chargingPoints = 2;
        instance3.color = "Blue";
        instance3.price = 2500;

        instance4.capacity = 25000;
        instance4.name = "Ambrane";
        instance4.chargingPoints = 4;
        instance4.color = "White";
        instance4.price = 3000;

        instance5.capacity = 30000;
        instance5.name = "Syska";
        instance5.chargingPoints = 5;
        instance5.color = "Grey";
        instance5.price = 4000;

        System.out.println("\n--- Updated Values ---");

        System.out.println("\nInstance1");
        System.out.println("Capacity: " + instance1.capacity);
        System.out.println("Name: " + instance1.name);
        System.out.println("ChargingPoints: " + instance1.chargingPoints);
        System.out.println("Color: " + instance1.color);
        System.out.println("Price: " + instance1.price);

        System.out.println("\nInstance2");
        System.out.println("Capacity: " + instance2.capacity);
        System.out.println("Name: " + instance2.name);
        System.out.println("ChargingPoints: " + instance2.chargingPoints);
        System.out.println("Color: " + instance2.color);
        System.out.println("Price: " + instance2.price);

        System.out.println("\nInstance3");
        System.out.println("Capacity: " + instance3.capacity);
        System.out.println("Name: " + instance3.name);
        System.out.println("ChargingPoints: " + instance3.chargingPoints);
        System.out.println("Color: " + instance3.color);
        System.out.println("Price: " + instance3.price);

        System.out.println("\nInstance4");
        System.out.println("Capacity: " + instance4.capacity);
        System.out.println("Name: " + instance4.name);
        System.out.println("ChargingPoints: " + instance4.chargingPoints);
        System.out.println("Color: " + instance4.color);
        System.out.println("Price: " + instance4.price);

        System.out.println("\nInstance5");
        System.out.println("Capacity: " + instance5.capacity);
        System.out.println("Name: " + instance5.name);
        System.out.println("ChargingPoints: " + instance5.chargingPoints);
        System.out.println("Color: " + instance5.color);
        System.out.println("Price: " + instance5.price);
    }
}