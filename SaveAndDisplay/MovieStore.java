class MovieStore {

	Movie[] movieArray = new Movie[20];
	int index = 0;

	void save(Movie movie){

		if(movie != null){

			if(this.index < this.movieArray.length){

				System.out.println("Movie is not null we can store info");

				this.movieArray[this.index] = movie;
				System.out.println("Movie stored in index: "+this.index);
				this.index++;

			}else{
				System.out.println("Array is full");
			}

		}else{
			System.out.println("Movie cannot be null");
		}
	}

	void display(){

		if(this.movieArray != null){

			System.out.println("\nNot null we can do display operation");

			for(int start=0; start<this.index; start++){

				if(this.movieArray[start] != null){

					System.out.println("\nElement at index "+start);
					this.movieArray[start].info();
				}
			}
		}
		else{
		System.out.println("array is null");
		}
		}
	
}