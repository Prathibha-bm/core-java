class CricketRun {

	public static void main(String[] args){

		Cricket cricket1 = new Cricket("ODI",11,"India",true,50,"Rohit",80000,"International",500000.0,true);
		Cricket cricket2 = new Cricket("T20",11,"England",true,20,"Buttler",65000,"League",300000.0,true);
		Cricket cricket3 = new Cricket("Test",11,"Australia",true,90,"Smith",90000,"International",800000.0,true);
		Cricket cricket4 = new Cricket("ODI",11,"Pakistan",true,50,"Babar",70000,"International",450000.0,true);
		Cricket cricket5 = new Cricket("T20",11,"SouthAfrica",true,20,"Markram",60000,"League",280000.0,true);
		Cricket cricket6 = new Cricket("Test",11,"India",true,90,"Kohli",85000,"International",750000.0,true);
		Cricket cricket7 = new Cricket("ODI",11,"NZ",true,50,"Williamson",68000,"International",420000.0,true);
		Cricket cricket8 = new Cricket("T20",11,"WI",true,20,"Pollard",50000,"League",250000.0,true);
		Cricket cricket9 = new Cricket("Test",11,"SriLanka",true,90,"Mendis",55000,"International",400000.0,true);
		Cricket cricket10 = new Cricket("ODI",11,"Bangladesh",true,50,"Shakib",62000,"International",390000.0,true);

		CricketStore cricketStore = new CricketStore();

		cricketStore.save(null);
		cricketStore.save(cricket1);
		cricketStore.save(cricket2);
		cricketStore.save(cricket3);
		cricketStore.save(cricket4);
		cricketStore.save(cricket5);
		cricketStore.save(cricket6);
		cricketStore.save(cricket7);
		cricketStore.save(cricket8);
		cricketStore.save(cricket9);
		cricketStore.save(cricket10);

		cricketStore.display();
	}
}