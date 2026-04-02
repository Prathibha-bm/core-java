class MainArtMaterial{
    public static void main(String[] args) {
        ArtMaterial a1 = new ArtMaterial("Sketch Pencil", "Faber-Castell", "Pencil", "Graphite", 5, true, 0.05, 15, 1, false);
        ArtMaterial a2 = new ArtMaterial("Acrylic Paint", "Camlin", "Paint", "Red", 10, true, 0.1, 10, 5, false);
        ArtMaterial a3 = new ArtMaterial("Watercolor Set", "Dollar", "Paint", "Multicolor", 15, true, 0.2, 20, 10, true);

        a1.showMethod();
        a2.showMethod();
        a3.showMethod();
    }
}