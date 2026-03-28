class SteelBar{

	public static void main(String[] args){
		Steel instance1=new Steel();
		Steel instance2=new Steel();
		Steel instance3=new Steel();
		Steel instance4=new Steel();
		Steel instance5=new Steel();
		
        System.out.println("\n--- Default Values ---");

        System.out.println("\nInstance1");
        System.out.println("Id: " + instance1.id);
        System.out.println("Type: " + instance1.type);
        System.out.println("Weight: " + instance1.weight);
        System.out.println("IsOriginal: " + instance1.isOriginal);
        System.out.println("Density: " + instance1.density);

        System.out.println("\nInstance2");
        System.out.println("Id: " + instance2.id);
        System.out.println("Type: " + instance2.type);
        System.out.println("Weight: " + instance2.weight);
        System.out.println("IsOriginal: " + instance2.isOriginal);
        System.out.println("Density: " + instance2.density);

        System.out.println("\nInstance3");
        System.out.println("Id: " + instance3.id);
        System.out.println("Type: " + instance3.type);
        System.out.println("Weight: " + instance3.weight);
        System.out.println("IsOriginal: " + instance3.isOriginal);
        System.out.println("Density: " + instance3.density);

        System.out.println("\nInstance4");
        System.out.println("Id: " + instance4.id);
        System.out.println("Type: " + instance4.type);
        System.out.println("Weight: " + instance4.weight);
        System.out.println("IsOriginal: " + instance4.isOriginal);
        System.out.println("Density: " + instance4.density);

        System.out.println("\nInstance5");
        System.out.println("Id: " + instance5.id);
        System.out.println("Type: " + instance5.type);
        System.out.println("Weight: " + instance5.weight);
        System.out.println("IsOriginal: " + instance5.isOriginal);
        System.out.println("Density: " + instance5.density);

        instance1.id = 101;
        instance1.type = "Iron";
        instance1.weight = 6.0;
        instance1.isOriginal = true;
        instance1.density = 7.8;

        instance2.id = 102;
        instance2.type = "Copper";
        instance2.weight = 5.5;
        instance2.isOriginal = true;
        instance2.density = 8.9;

        instance3.id = 103;
        instance3.type = "Aluminum";
        instance3.weight = 3.2;
        instance3.isOriginal = false;
        instance3.density = 2.7;

        instance4.id = 104;
        instance4.type = "Gold";
        instance4.weight = 10.0;
        instance4.isOriginal = true;
        instance4.density = 19.3;

        instance5.id = 105;
        instance5.type = "Silver";
        instance5.weight = 7.0;
        instance5.isOriginal = false;
        instance5.density = 10.5;

        System.out.println("\n--- Updated Values ---");

        System.out.println("\nInstance1");
        System.out.println("Id: " + instance1.id);
        System.out.println("Type: " + instance1.type);
        System.out.println("Weight: " + instance1.weight);
        System.out.println("IsOriginal: " + instance1.isOriginal);
        System.out.println("Density: " + instance1.density);

        System.out.println("\nInstance2");
        System.out.println("Id: " + instance2.id);
        System.out.println("Type: " + instance2.type);
        System.out.println("Weight: " + instance2.weight);
        System.out.println("IsOriginal: " + instance2.isOriginal);
        System.out.println("Density: " + instance2.density);

        System.out.println("\nInstance3");
        System.out.println("Id: " + instance3.id);
        System.out.println("Type: " + instance3.type);
        System.out.println("Weight: " + instance3.weight);
        System.out.println("IsOriginal: " + instance3.isOriginal);
        System.out.println("Density: " + instance3.density);

        System.out.println("\nInstance4");
        System.out.println("Id: " + instance4.id);
        System.out.println("Type: " + instance4.type);
        System.out.println("Weight: " + instance4.weight);
        System.out.println("IsOriginal: " + instance4.isOriginal);
        System.out.println("Density: " + instance4.density);

        System.out.println("\nInstance5");
        System.out.println("Id: " + instance5.id);
        System.out.println("Type: " + instance5.type);
        System.out.println("Weight: " + instance5.weight);
        System.out.println("IsOriginal: " + instance5.isOriginal);
        System.out.println("Density: " + instance5.density);
    }
}