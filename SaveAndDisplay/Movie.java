class Movie {

	String title;
    String genre;
    double rating;
    int duration;
    String language;
    String director;
    int releaseYear;
    String hero;
    String heroine;
    boolean isHit;

	public Movie(String title,String genre,double rating,int duration,String language,
                 String director,int releaseYear,String hero,String heroine,boolean isHit){

		this.title = title;
		this.genre = genre;
		this.rating = rating;
		this.duration = duration;
		this.language = language;
		this.director = director;
		this.releaseYear = releaseYear;
		this.hero = hero;
		this.heroine = heroine;
		this.isHit = isHit;
	}

	void info(){

		System.out.println("Running info in Movie");

		System.out.println("title: "+this.title);
		System.out.println("genre: "+this.genre);
		System.out.println("rating: "+this.rating);
		System.out.println("duration: "+this.duration);
		System.out.println("language: "+this.language);
		System.out.println("director: "+this.director);
		System.out.println("releaseYear: "+this.releaseYear);
		System.out.println("hero: "+this.hero);
		System.out.println("heroine: "+this.heroine);
		System.out.println("isHit: "+this.isHit);
	}
}