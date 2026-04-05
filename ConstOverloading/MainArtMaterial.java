class MainArtMaterial{
    public static void main(String[] args) {
        ArtMaterial a1 = new ArtMaterial();
        ArtMaterial a2 = new ArtMaterial("Acrylic Paint");
        ArtMaterial  a3 = new ArtMaterial("Dollar", "Paint", "Multicolor");
		 ArtMaterial a4 = new ArtMaterial( 15, true, 0.2, 20);
		 ArtMaterial a5 = new ArtMaterial(10, true);

        a1.showMethod();
        a2.showMethod();
        a3.showMethod();
		a4.showMethod();
		a5.showMethod();
    }
}