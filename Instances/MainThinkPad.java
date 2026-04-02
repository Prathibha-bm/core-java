class MainThinkPad {
    public static void main(String[] args) {
        ThinkPad tp1 = new ThinkPad("X1 Carbon", "Lenovo", 14, 1.1, 1500, true, 16, 512, "Intel i7", true);
        ThinkPad tp2 = new ThinkPad("T14", "Lenovo", 14, 1.5, 1200, false, 8, 256, "Intel i5", false);
        ThinkPad tp3 = new ThinkPad("P15", "Lenovo", 15.6, 2.0, 2000, true, 32, 1024, "Intel i9", true);

        tp1.showMethod();
        tp2.showMethod();
        tp3.showMethod();
    }
}