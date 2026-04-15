class MovieRun {

	public static void main(String[] args){

		Movie movie1 = new Movie("KGF","Action",9.0,180,"Kannada","Prashanth",2018,"Yash","Srinidhi",true);
		Movie movie2 = new Movie("RRR","Action",8.8,187,"Telugu","Rajamouli",2022,"NTR","Alia",true);
		Movie movie3 = new Movie("Bahubali","Epic",9.2,200,"Telugu","Rajamouli",2015,"Prabhas","Anushka",true);
		Movie movie4 = new Movie("Pushpa","Action",8.5,170,"Telugu","Sukumar",2021,"AlluArjun","Rashmika",true);
		Movie movie5 = new Movie("Vikram","Action",8.7,175,"Tamil","Lokesh",2022,"Kamal","VijaySethupathi",true);
		Movie movie6 = new Movie("Leo","Action",8.3,180,"Tamil","Lokesh",2023,"Vijay","Trisha",true);
		Movie movie7 = new Movie("Dangal","Sports",8.9,160,"Hindi","Aamir",2016,"Aamir","Fatima",true);
		Movie movie8 = new Movie("3Idiots","Comedy",9.1,170,"Hindi","Rajkumar",2009,"Aamir","Kareena",true);
		Movie movie9 = new Movie("Don","Action",8.0,150,"Hindi","Farhan",2006,"SRK","Priyanka",true);
		Movie movie10 = new Movie("War","Action",8.2,160,"Hindi","Siddharth",2019,"Hrithik","Tiger",true);

		MovieStore movieStore = new MovieStore();

		movieStore.save(null);
		movieStore.save(movie1);
		movieStore.save(movie2);
		movieStore.save(movie3);
		movieStore.save(movie4);
		movieStore.save(movie5);
		movieStore.save(movie6);
		movieStore.save(movie7);
		movieStore.save(movie8);
		movieStore.save(movie9);
		movieStore.save(movie10);

		movieStore.display();
	}
}