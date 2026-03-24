class PlantNames{
	
	public static void main(String[] args){
		
		String plantName1=" Money Plant";
		String plantName2="Snake Plant";
		String plantName3="Aloe Vera";
		String plantName4="Spider Plant";
		String plantName5="Peace Lily";
		String plantName6="Rubber Plant";
		String plantName7="Bamboo Plant ";
		String plantName8="Rubber Plant";
		String plantName9="Rose ";
		String plantName10="Jasmine plant ";
		String plantName11="Sunflower plant";
		String plantName12="Tulsi ";
		String plantName13="Lemongrass";
		String plantName14="Turmeric ";
		String plantName15="Ashwagandha ";
		String plantName16="Mango Tree ";
		String plantName17="Coconut Tree";
		String plantName18="Banana ";
		String plantName19="Cactus";
		String plantName20="Bonsai";
		String plantName21="Papaya ";
		String plantName22="Curry Leaf Plant";
		String plantName23="Lavender";
		String plantName24="Ashwagandha";
		String plantName25="Marigold ";
		
		
		
	
			String[] plantsName={plantName1,plantName2,plantName3,plantName4,plantName5,plantName6,plantName7,plantName8,plantName9,plantName10,plantName11,plantName12,plantName13,plantName14,plantName15,plantName16,plantName17,plantName18,plantName19,plantName20,plantName21,plantName22,plantName23,plantName24,plantName25};
			
			plantsName[6]="Neem";
			
			for(int plant=0;plant<=24;plant++){
			System.out.println(plantsName[plant]);
			}
			
			System.out.println("\n Reverse :\n");
			
			for(int plant=24;plant>=0;plant--){
			System.out.println(plantsName[plant]);
			}
			
			String item2=plantsName[26];			
		}
}
