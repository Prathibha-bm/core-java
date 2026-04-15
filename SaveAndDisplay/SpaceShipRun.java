class SpaceShipRun {

	public static void main(String[] args){

		SpaceShip spaceShip1 = new SpaceShip("Apollo","25000km/h",3,true,"USA","Moon Mission",50000.0,3,"Chemical",true);
		SpaceShip spaceShip2 = new SpaceShip("Chandrayaan","24000km/h",2,true,"India","Lunar Mission",45000.0,2,"Hybrid",true);
		SpaceShip spaceShip3 = new SpaceShip("Falcon","30000km/h",5,true,"USA","Cargo",60000.0,0,"Reusable",false);
		SpaceShip spaceShip4 = new SpaceShip("Starship","35000km/h",100,true,"USA","Mars Mission",90000.0,10,"Methane",true);
		SpaceShip spaceShip5 = new SpaceShip("Voyager","15000km/h",0,false,"USA","Deep Space",20000.0,0,"Ion",false);
		SpaceShip spaceShip6 = new SpaceShip("PSLV","22000km/h",2,true,"India","Satellite",40000.0,2,"Solid",true);
		SpaceShip spaceShip7 = new SpaceShip("Gaganyaan","23000km/h",3,true,"India","Human Space",48000.0,3,"Liquid",true);
		SpaceShip spaceShip8 = new SpaceShip("Dragon","28000km/h",7,true,"USA","Cargo",55000.0,0,"Reusable",false);
		SpaceShip spaceShip9 = new SpaceShip("Hubble","0km/h",0,false,"USA","Space Telescope",30000.0,0,"Solar",false);
		SpaceShip spaceShip10 = new SpaceShip("ISS","27000km/h",6,false,"International","Research",70000.0,6,"Station",true);

		SpaceShipStore spaceShipStore = new SpaceShipStore();

		spaceShipStore.save(null);
		spaceShipStore.save(spaceShip1);
		spaceShipStore.save(spaceShip2);
		spaceShipStore.save(spaceShip3);
		spaceShipStore.save(spaceShip4);
		spaceShipStore.save(spaceShip5);
		spaceShipStore.save(spaceShip6);
		spaceShipStore.save(spaceShip7);
		spaceShipStore.save(spaceShip8);
		spaceShipStore.save(spaceShip9);
		spaceShipStore.save(spaceShip10);

		spaceShipStore.display();
	}
}