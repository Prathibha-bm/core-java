class Folder{

    String name;
    String classification;
    String path;
    File[] files;

    Folder(String name, String classification, String path, File[] files) {
        this.name = name;
        this.classification = classification;
        this.path = path;
        this.files = files;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Classification: " + this.classification);
        System.out.println("Path: " + this.path);

        if (files != null) {
            for (File file : this.files) {
                if (file != null) {
                    file.info();
                } else {
                    System.out.println("null value");
                }
            }
        }
    }
}
