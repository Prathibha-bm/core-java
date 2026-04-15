class GloveStore {

	Glove[] gloveArray = new Glove[20];
	int index = 0;

	void save(Glove glove){

		if(glove != null){

			if(this.index < this.gloveArray.length){

				System.out.println("Glove is not null we can store info");

				this.gloveArray[this.index] = glove;
				System.out.println("Glove stored in index: "+this.index);
				this.index++;

			}else{
				System.out.println("Array is full");
			}

		}else{
			System.out.println("Glove cannot be null");
		}
	}

	void display(){

		if(this.gloveArray != null){

			System.out.println("\nNot null we can do display operation");

			for(int start=0; start<this.index; start++){

				if(this.gloveArray[start] != null){

					System.out.println("\nElement at index "+start);
					this.gloveArray[start].info();
				}
			}
		}
		else{
		System.out.println("array is null");
		}	
	}
}