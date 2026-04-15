class Cricket {

	String format;
    int players;
    String country;
    boolean isInternational;
    int overs;
    String captain;
    int stadiumCapacity;
    String matchType;
    double matchFee;
    boolean isLiveTelecast;

	public Cricket(String format,int players,String country,boolean isInternational,int overs,
                   String captain,int stadiumCapacity,String matchType,double matchFee,boolean isLiveTelecast){

		this.format = format;
		this.players = players;
		this.country = country;
		this.isInternational = isInternational;
		this.overs = overs;
		this.captain = captain;
		this.stadiumCapacity = stadiumCapacity;
		this.matchType = matchType;
		this.matchFee = matchFee;
		this.isLiveTelecast = isLiveTelecast;
	}

	void info(){

		System.out.println("Running info in Cricket");

		System.out.println("format: "+this.format);
		System.out.println("players: "+this.players);
		System.out.println("country: "+this.country);
		System.out.println("isInternational: "+this.isInternational);
		System.out.println("overs: "+this.overs);
		System.out.println("captain: "+this.captain);
		System.out.println("stadiumCapacity: "+this.stadiumCapacity);
		System.out.println("matchType: "+this.matchType);
		System.out.println("matchFee: "+this.matchFee);
		System.out.println("isLiveTelecast: "+this.isLiveTelecast);
	}
}