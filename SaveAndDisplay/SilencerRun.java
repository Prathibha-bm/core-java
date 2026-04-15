class SilencerRun{

	public static void main(String[] args){

		Silencer silencer1 = new Silencer("Bosch","Steel",12.5,2000,true,"Bike",5,2.5,"Black",true);
		Silencer silencer2 = new Silencer("Honda","Alloy",13.0,2500,true,"Car",6,3.0,"Silver",true);
		Silencer silencer3 = new Silencer("Yamaha","Steel",11.8,1800,false,"Bike",4,2.2,"Black",false);
		Silencer silencer4 = new Silencer("Suzuki","Iron",14.2,2700,true,"Car",7,3.5,"Gray",true);
		Silencer silencer5 = new Silencer("TVS","Steel",12.0,1900,false,"Bike",5,2.4,"Black",true);
		Silencer silencer6 = new Silencer("Bajaj","Alloy",13.5,2100,true,"Bike",6,2.8,"Silver",true);
		Silencer silencer7 = new Silencer("Hero","Steel",11.5,1700,false,"Bike",4,2.1,"Black",false);
		Silencer silencer8 = new Silencer("Ford","Iron",15.0,3000,true,"Car",8,3.8,"Gray",true);
		Silencer silencer9 = new Silencer("Hyundai","Steel",14.0,2600,true,"Car",7,3.2,"Black",true);
		Silencer silencer10 = new Silencer("Kia","Alloy",13.8,2550,true,"Car",6,3.1,"Silver",true);

		Silencer silencer11 = new Silencer("BMW","Steel",15.5,5000,true,"Car",9,4.0,"Black",true);
		Silencer silencer12 = new Silencer("Audi","Alloy",15.2,5200,true,"Car",9,4.2,"Silver",true);
		Silencer silencer13 = new Silencer("Tesla","Carbon",14.5,6000,true,"Car",10,3.5,"Black",true);
		Silencer silencer14 = new Silencer("Nissan","Steel",13.9,2400,false,"Car",6,3.0,"Gray",false);
		Silencer silencer15 = new Silencer("Chevy","Iron",14.3,2800,true,"Car",7,3.3,"Black",true);
		Silencer silencer16 = new Silencer("Jeep","Steel",15.8,4500,true,"SUV",8,4.5,"Black",true);
		Silencer silencer17 = new Silencer("Ducati","Alloy",12.7,3500,true,"Bike",7,2.9,"Red",true);
		Silencer silencer18 = new Silencer("KTM","Steel",12.3,3000,true,"Bike",6,2.7,"Orange",true);
		Silencer silencer19 = new Silencer("RoyalEnfield","Iron",13.6,3200,true,"Bike",7,3.4,"Black",true);
		Silencer silencer20 = new Silencer("Harley","Steel",16.0,7000,true,"Bike",10,5.0,"Chrome",true);

		SilencerStore silencerStore = new SilencerStore();

		silencerStore.save(null);
		silencerStore.save(silencer1);
		silencerStore.save(silencer2);
		silencerStore.save(silencer3);
		silencerStore.save(silencer4);
		silencerStore.save(silencer5);
		silencerStore.save(silencer6);
		silencerStore.save(silencer7);
		silencerStore.save(silencer8);
		silencerStore.save(silencer9);
		silencerStore.save(silencer10);
		silencerStore.save(silencer11);
		silencerStore.save(silencer12);
		silencerStore.save(silencer13);
		silencerStore.save(silencer14);
		silencerStore.save(silencer15);
		silencerStore.save(silencer16);
		silencerStore.save(silencer17);
		silencerStore.save(silencer18);
		silencerStore.save(silencer19);
		silencerStore.save(silencer20);

		silencerStore.display();
	}
}