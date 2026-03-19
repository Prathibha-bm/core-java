class Mobile{
    
    static String getMobileByName(String name) {
        System.out.println("Get Mobile no By Name: " + name);

        if ("Ravi"==name) {
            System.out.println("Mobile:9876543210");
            return "9876543210";
        }

        if ("Amit"==name) {
            System.out.println("Mobile: 9123456780");
            return "9123456780";
        }

        if ("Suresh"==name) {
            System.out.println("Mobile: 9012345678");
            return "9012345678";
        }

        if ("Priya"==name) {
            System.out.println("Mobile: 9988776655");
            return "9988776655";
        }

        if ("Neha"==name) {
            System.out.println("Mobile: 9090909090");
            return "9090909090";
        }

        if ("Rahul"==name) {
            System.out.println("Mobile: 9887766554");
            return "9887766554";
        }

        if ("Anjali"==name) {
            System.out.println("Mobile: 9776655443");
            return "9776655443";
        }

        if ("Vikram"==name) {
            System.out.println("Mobile: 9665544332");
            return "9665544332";
        }

        if ("Kiran"==name) {
            System.out.println("Mobile: 9554433221");
            return "9554433221";
        }

        if ("Pooja"==name) {
            System.out.println("Mobile: 9443322110");
            return "9443322110";
        }

        if ("Arjun"==name) {
            System.out.println("Mobile: 9332211009");
            return "9332211009";
        }

        if ("Sneha"==name) {
            System.out.println("Mobile: 9221100098");
            return "9221100098";
        }

        if ("Manoj"==name) {
            System.out.println("Mobile: 9110009876");
            return "9110009876";
        }

        if ("Deepa"==name) {
            System.out.println("Mobile: 9000098765");
            return "9000098765";
        }

        if ("Ramesh"==name) {
            System.out.println("Mobile: 9898989898");
            return "9898989898";
        }

        System.out.println("..Not Found..");
        return "No Mobile Number Found";
    }
}