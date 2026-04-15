class LaserRun{

	public static void main(String[] args){

		Laser laser1 = new Laser("Cutting",120.5,"Red",true,5000,"Industrial",1000,"Bosch",2.5,true);
		Laser laser2 = new Laser("Medical",80.0,"Blue",true,7000,"Surgery",500,"Philips",1.8,true);
		Laser laser3 = new Laser("Security",60.0,"Green",false,3000,"Scanning",300,"Honeywell",2.0,false);
		Laser laser4 = new Laser("Cutting",150.0,"Red",true,9000,"Factory",1200,"Makita",3.0,true);
		Laser laser5 = new Laser("Medical",70.5,"Blue",true,6500,"Dental",450,"Siemens",1.5,true);
		Laser laser6 = new Laser("Security",55.0,"Green",false,2800,"Airport",350,"Canon",2.2,false);
		Laser laser7 = new Laser("Cutting",140.0,"Red",true,8500,"Industrial",1100,"Hitachi",2.8,true);
		Laser laser8 = new Laser("Medical",75.0,"Blue",true,7200,"Surgery",520,"GE",1.9,true);
		Laser laser9 = new Laser("Security",65.0,"Green",false,3200,"Scanning",400,"Sony",2.1,false);
		Laser laser10 = new Laser("Cutting",160.0,"Red",true,9500,"Factory",1300,"Panasonic",3.2,true);

		LaserStore laserStore = new LaserStore();

		laserStore.save(null);
		laserStore.save(laser1);
		laserStore.save(laser2);
		laserStore.save(laser3);
		laserStore.save(laser4);
		laserStore.save(laser5);
		laserStore.save(laser6);
		laserStore.save(laser7);
		laserStore.save(laser8);
		laserStore.save(laser9);
		laserStore.save(laser10);

		laserStore.display();
	}
}