class DusterRunner {
    public static void main(String[] args) {

        Duster d1 = new Duster("Classmate", "White", true);
        d1.price = 50;
        d1.material=Material.FOAM;

        Duster d2 = new Duster("Camlin", "Black", false);
        d2.price = 40;
        d2.material=Material.PLASTIC;

        Duster d3 = new Duster("Natraj", "Blue", true);
        d3.price = 60;
        d3.material =Material.FIBER;

        Duster[] arr = {d1,d2,d3};

        Classroom c = new Classroom(101, 2, arr);
        c.display();
    }
}