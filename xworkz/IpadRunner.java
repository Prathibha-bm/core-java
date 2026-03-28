class IpadRunner {

    public static void main(String[] args) {

        Ipad instance1 = new Ipad();
        Ipad instance2 = new Ipad();
        Ipad instance3 = new Ipad();
        Ipad instance4 = new Ipad();
        Ipad instance5 = new Ipad();

        System.out.println("\nDefault Values");

        System.out.println("\nInstance1");
        System.out.println("Id: " + instance1.id);
        System.out.println("Model: " + instance1.model);
        System.out.println("Storage: " + instance1.storage);
        System.out.println("Color: " + instance1.color);
        System.out.println("Price: " + instance1.price);

        System.out.println("\nInstance2");
        System.out.println("Id: " + instance2.id);
        System.out.println("Model: " + instance2.model);
        System.out.println("Storage: " + instance2.storage);
        System.out.println("Color: " + instance2.color);
        System.out.println("Price: " + instance2.price);

        System.out.println("\nInstance3");
        System.out.println("Id: " + instance3.id);
        System.out.println("Model: " + instance3.model);
        System.out.println("Storage: " + instance3.storage);
        System.out.println("Color: " + instance3.color);
        System.out.println("Price: " + instance3.price);

        System.out.println("\nInstance4");
        System.out.println("Id: " + instance4.id);
        System.out.println("Model: " + instance4.model);
        System.out.println("Storage: " + instance4.storage);
        System.out.println("Color: " + instance4.color);
        System.out.println("Price: " + instance4.price);

        System.out.println("\nInstance5");
        System.out.println("Id: " + instance5.id);
        System.out.println("Model: " + instance5.model);
        System.out.println("Storage: " + instance5.storage);
        System.out.println("Color: " + instance5.color);
        System.out.println("Price: " + instance5.price);

        instance1.id = 1001;
        instance1.model = "iPad 9th Gen";
        instance1.storage = 64;
        instance1.color = "Silver";
        instance1.price = 30000;

        instance2.id = 1002;
        instance2.model = "iPad 10th Gen";
        instance2.storage = 128;
        instance2.color = "Blue";
        instance2.price = 45000;

        instance3.id = 1003;
        instance3.model = "iPad Air";
        instance3.storage = 256;
        instance3.color = "Space Grey";
        instance3.price = 60000;

        instance4.id = 1004;
        instance4.model = "iPad Pro 11";
        instance4.storage = 512;
        instance4.color = "Black";
        instance4.price = 85000;

        instance5.id = 1005;
        instance5.model = "iPad Pro 12.9";
        instance5.storage = 1024;
        instance5.color = "White";
        instance5.price = 120000;

        System.out.println("\n--- Updated Values ---");

        System.out.println("\nInstance1");
        System.out.println("Id: " + instance1.id);
        System.out.println("Model: " + instance1.model);
        System.out.println("Storage: " + instance1.storage);
        System.out.println("Color: " + instance1.color);
        System.out.println("Price: " + instance1.price);

        System.out.println("\nInstance2");
        System.out.println("Id: " + instance2.id);
        System.out.println("Model: " + instance2.model);
        System.out.println("Storage: " + instance2.storage);
        System.out.println("Color: " + instance2.color);
        System.out.println("Price: " + instance2.price);

        System.out.println("\nInstance3");
        System.out.println("Id: " + instance3.id);
        System.out.println("Model: " + instance3.model);
        System.out.println("Storage: " + instance3.storage);
        System.out.println("Color: " + instance3.color);
        System.out.println("Price: " + instance3.price);

        System.out.println("\nInstance4");
        System.out.println("Id: " + instance4.id);
        System.out.println("Model: " + instance4.model);
        System.out.println("Storage: " + instance4.storage);
        System.out.println("Color: " + instance4.color);
        System.out.println("Price: " + instance4.price);

        System.out.println("\nInstance5");
        System.out.println("Id: " + instance5.id);
        System.out.println("Model: " + instance5.model);
        System.out.println("Storage: " + instance5.storage);
        System.out.println("Color: " + instance5.color);
        System.out.println("Price: " + instance5.price);
    }
}