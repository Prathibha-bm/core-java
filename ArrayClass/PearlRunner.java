class PearlRunner {
    public static void main(String[] args) {

        Pearl p1 = new Pearl("White", 500, true);
        p1.shape = "Round";
        p1.size =PearlSize.SMALL;

        Pearl p2 = new Pearl("Pink", 700, false);
        p2.shape = "Oval";
        p2.size =PearlSize.MEDIUM;

        Pearl p3 = new Pearl("Black", 1000, true);
        p3.shape = "Round";
        p3.size =PearlSize.LARGE;

        Pearl[] pearls = {p1, p2, p3};

        Box box = new Box(2.5, 10, 5, pearls);
        box.display();
    }
}