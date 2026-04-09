class LightHouse {

    String name;
    int height;
    boolean isActive;
    Location location;   
    int yearBuilt;     

    LightHouse(String name, int height, boolean isActive) {
        this.name = name;
        this.height = height;
        this.isActive = isActive;
    }

    void info() {
        System.out.println("\nRunning info in LightHouse");
        System.out.println("Name: " + this.name);
        System.out.println("Height: " + this.height);
        System.out.println("Active: " + this.isActive);
        System.out.println("Location: " + this.location);
        System.out.println("Year: " + this.yearBuilt);
    }
}

