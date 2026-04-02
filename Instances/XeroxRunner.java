class XeroxRunner{
    public static void main(String[] args) {
        Xerox x1 = new Xerox("WorkCentre 3335", "Xerox", 35, 250, false, true, "USB", 12.5, 350, false);
        Xerox x2 = new Xerox("VersaLink C405", "Xerox", 40, 500, true, true, "Wi-Fi", 18.0, 650, true);
        Xerox x3 = new Xerox("AltaLink C8030", "Xerox", 55, 1000, true, true, "Ethernet", 32.0, 1200, true);

        x1.showMethod();
        x2.showMethod();
        x3.showMethod();
    }
}