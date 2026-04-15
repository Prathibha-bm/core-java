class WaterMelonRun{
	
	public static void main(String... args){
	
		WaterMelon waterMelon1=new WaterMelon("Green",5.2,"Round",120,true,"India",300,25.5,"Sugar Baby",true);
		WaterMelon waterMelon2=new WaterMelon("Dark Green",6.1,"Oval",140,true,"Brazil",280,27.0,"Crimson Sweet",true);
		WaterMelon waterMelon3=new WaterMelon("Light Green",4.8,"Round",110,false,"USA",200,23.5,"Yellow Doll",false);
		WaterMelon waterMelon4=new WaterMelon("Striped",5.5,"Oval",130,true,"Mexico",260,26.0,"Jubilee",true);
		WaterMelon waterMelon5=new WaterMelon("Green",6.3,"Round",150,true,"India",310,28.5,"All Sweet",true);
		WaterMelon waterMelon6=new WaterMelon("Dark Green",4.9,"Oval",115,false,"China",190,22.0,"Mini Love",false);
		WaterMelon waterMelon7=new WaterMelon("Light Green",5.0,"Round",125,true,"Australia",220,24.5,"Golden Crown",true);
		WaterMelon waterMelon8=new WaterMelon("Striped",6.7,"Oval",160,true,"Spain",330,29.0,"Sangria",true);
		WaterMelon waterMelon9=new WaterMelon("Green",5.8,"Round",135,true,"Turkey",270,26.5,"Moon and Stars",true);
		WaterMelon waterMelon10=new WaterMelon("Dark Green",4.6,"Oval",105,false,"Japan",180,21.5,"Black Diamond",false);
		WaterMelon waterMelon11=new WaterMelon("Light Green",5.3,"Round",128,true,"India",240,25.0,"Sugar Heart",true);
		WaterMelon waterMelon12=new WaterMelon("Striped",6.2,"Oval",145,true,"USA",300,27.5,"Charleston Gray",true);
		WaterMelon waterMelon13=new WaterMelon("Green",4.7,"Round",112,false,"Thailand",195,23.0,"Sweet Beauty",false);
		WaterMelon waterMelon14=new WaterMelon("Dark Green",6.5,"Oval",155,true,"Brazil",320,28.8,"Royal Sweet",true);
		WaterMelon waterMelon15=new WaterMelon("Light Green",5.1,"Round",122,true,"India",210,24.2,"Baby Doll",true);
		WaterMelon waterMelon16=new WaterMelon("Striped",6.8,"Oval",170,true,"Mexico",340,30.0,"Big Crimson",true);
		WaterMelon waterMelon17=new WaterMelon("Green",5.4,"Round",129,true,"Italy",250,25.8,"Emerald Sweet",true);
		WaterMelon waterMelon18=new WaterMelon("Dark Green",4.5,"Oval",108,false,"China",175,21.0,"Mini Star",false);
		WaterMelon waterMelon19=new WaterMelon("Light Green",5.9,"Round",138,true,"India",260,26.8,"Sweet Gem",true);
		WaterMelon waterMelon20=new WaterMelon("Striped",6.4,"Oval",148,true,"USA",290,27.9,"Sun Gold",true);
		
		
		WatermelonStore watermelonStore=new WatermelonStore();
		
		watermelonStore.save(null);
		watermelonStore.save(waterMelon1);
		watermelonStore.save(waterMelon2);
		watermelonStore.save(waterMelon3);
		watermelonStore.save(waterMelon4);
		watermelonStore.save(waterMelon5);
		watermelonStore.save(waterMelon6);
		watermelonStore.save(waterMelon7);
		watermelonStore.save(waterMelon8);
		watermelonStore.save(waterMelon9);
		watermelonStore.save(waterMelon10);
		watermelonStore.save(waterMelon11);
		watermelonStore.save(waterMelon12);
		watermelonStore.save(waterMelon13);
		watermelonStore.save(waterMelon14);
		watermelonStore.save(waterMelon15);
		watermelonStore.save(waterMelon16);
		watermelonStore.save(waterMelon17);
		watermelonStore.save(waterMelon18);
		watermelonStore.save(waterMelon19);
		watermelonStore.save(waterMelon20);
		
		watermelonStore.display();
		
		
		
		
	
	
	}
}