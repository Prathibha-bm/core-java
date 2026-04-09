class Box {

    double weight;
    double length;
    double height;
    Pearl[] pearls;

    Box(double weight, double length, double height, Pearl[] pearls) {
        this.weight = weight;
        this.length = length;
        this.height = height;
        this.pearls = pearls;
    }

    void display() {
        System.out.println("Weight: " + this.weight);
        System.out.println("Length: " + this.length);
        System.out.println("Height: " + this.height);

        if (pearls != null) {
            for (Pearl pearl : this.pearls) {
                if (pearl != null) {
                    pearl.info();
                } else {
                    System.out.println("null value");
                }
            }
        }
    }
}

