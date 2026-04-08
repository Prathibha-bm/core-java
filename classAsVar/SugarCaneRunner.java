class SugarCaneRunner{
	
 public static void main(String... args){
	 
	 SugarCane sugarCane=new SugarCane();
	 sugarCane.scientificName="Saccharum officinarum ";
	 sugarCane.sweetness=Sweetness.HIGH;
	 
	 SugarFactory sugarFactory = new SugarFactory("SK sugars",1965);
	 
	 sugarFactory.location="Mandya";
	 sugarFactory.sugarCane=sugarCane;
	 
	 
	 
	 sugarFactory.display();
	 
	 
 }
}

	 
 