class File {

    String name;
    String type;
    int size;
    CreatedBy createdBy;   
    boolean isHidden;   
	
	
    File(String name, String type, int size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    void info() {
        System.out.println("\nRunning info in File");
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Size: " + this.size);
        System.out.println("Created By: " + this.createdBy);
        System.out.println("Hidden: " + this.isHidden);
    }
}
