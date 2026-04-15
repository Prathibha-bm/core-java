class ScreenRun{
	
	public static void main(String... args){
	
		Screen screen1 = new Screen("Dell", "LED", 24.0, "1920x1080", false, 60, "IPS", 250.0, true, "Black");
		Screen screen2 = new Screen("HP", "LCD", 21.5, "1366x768", false, 60, "TN", 200.0, false, "Black");
		Screen screen3 = new Screen("Samsung", "LED", 27.0, "2560x1440", false, 75, "IPS", 300.0, true, "White");
		Screen screen4 = new Screen("LG", "LED", 32.0, "3840x2160", true, 60, "IPS", 350.0, true, "Black");
		Screen screen5 = new Screen("Acer", "LED", 24.5, "1920x1080", false, 144, "VA", 280.0, true, "Black");
		Screen screen6 = new Screen("Asus", "LED", 27.0, "1920x1080", false, 165, "IPS", 300.0, true, "Black");
		Screen screen7 = new Screen("BenQ", "LCD", 22.0, "1920x1080", false, 60, "TN", 220.0, false, "Gray");
		Screen screen8 = new Screen("MSI", "LED", 27.0, "2560x1440", false, 144, "IPS", 320.0, true, "Black");
		Screen screen9 = new Screen("Lenovo", "LED", 23.8, "1920x1080", false, 75, "IPS", 250.0, true, "Black");
		Screen screen10 = new Screen("ViewSonic", "LED", 24.0, "1920x1080", false, 60, "VA", 240.0, true, "Black");
		Screen screen11 = new Screen("Dell", "LED", 27.0, "3840x2160", true, 60, "IPS", 350.0, true, "Silver");
		Screen screen12 = new Screen("HP", "LED", 24.0, "1920x1080", false, 75, "IPS", 250.0, true, "White");
		Screen screen13 = new Screen("Samsung", "LED", 32.0, "2560x1440", false, 144, "VA", 330.0, true, "Black");
		Screen screen14 = new Screen("LG", "LED", 29.0, "2560x1080", false, 75, "IPS", 300.0, true, "Black");
		Screen screen15 = new Screen("Acer", "LED", 27.0, "1920x1080", false, 165, "TN", 270.0, false, "Black");
		Screen screen16 = new Screen("Asus", "LED", 32.0, "3840x2160", false, 60, "IPS", 400.0, true, "Black");
		Screen screen17 = new Screen("BenQ", "LED", 25.0, "1920x1080", false, 144, "IPS", 280.0, true, "Gray");
		Screen screen18 = new Screen("MSI", "LED", 34.0, "3440x1440", false, 144, "VA", 350.0, true, "Black");
		Screen screen19 = new Screen("Lenovo", "LED", 21.5, "1920x1080", false, 60, "TN", 220.0, false, "Black");
		Screen screen20 = new Screen("ViewSonic", "LED", 27.0, "2560x1440", false, 75, "IPS", 300.0, true, "Black");

		
		ScreenStore screenStore=new ScreenStore();
		
		screenStore.store(null);
		screenStore.store(screen1);
		screenStore.store(screen2);
		screenStore.store(screen3);
		screenStore.store(screen4);
		screenStore.store(screen5);
		screenStore.store(screen6);
		screenStore.store(screen7);
		screenStore.store(screen8);
		screenStore.store(screen9);
		screenStore.store(screen10);
		screenStore.store(screen11);
		screenStore.store(screen12);
		screenStore.store(screen13);
		screenStore.store(screen14);
		screenStore.store(screen15);
		screenStore.store(screen16);
		screenStore.store(screen17);
		screenStore.store(screen18);
		screenStore.store(screen19);
		screenStore.store(screen20);
		
		screenStore.display();
	
	
	
	}
}