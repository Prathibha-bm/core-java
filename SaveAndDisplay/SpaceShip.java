class SpaceShip{

	String name;
    String speed;
    int capacity;
    boolean isReusable;
    String country;
    String missionType;
    double fuelCapacity;
    int crewMembers;
    String engineType;
    boolean isManned;

	public SpaceShip(String name,String speed,int capacity,boolean isReusable,String country,
                     String missionType,double fuelCapacity,int crewMembers,String engineType,boolean isManned){

		this.name = name;
		this.speed = speed;
		this.capacity = capacity;
		this.isReusable = isReusable;
		this.country = country;
		this.missionType = missionType;
		this.fuelCapacity = fuelCapacity;
		this.crewMembers = crewMembers;
		this.engineType = engineType;
		this.isManned = isManned;
	}

	void info(){

		System.out.println("Running info in SpaceShip");

		System.out.println("name: "+this.name);
		System.out.println("speed: "+this.speed);
		System.out.println("capacity: "+this.capacity);
		System.out.println("isReusable: "+this.isReusable);
		System.out.println("country: "+this.country);
		System.out.println("missionType: "+this.missionType);
		System.out.println("fuelCapacity: "+this.fuelCapacity);
		System.out.println("crewMembers: "+this.crewMembers);
		System.out.println("engineType: "+this.engineType);
		System.out.println("isManned: "+this.isManned);
	}
}