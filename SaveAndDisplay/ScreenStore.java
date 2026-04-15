class ScreenStore{
    
	Screen[] screens=new Screen[20];
	int index=0;
	
  void store(Screen screen){
	  if (screen==null){
		System.out.println("Screen is null") ;
		
	  }
	  else{
		  
		  System.out.println("\nscreen is not null we can store");
		  
		  if(this.index<this.screens.length){
			  this.screens[this.index]=screen;
			  
			  System.out.println("...Screen is sored in index...:"+this.index);
			  this.index++;
		  }
		  else{
			  System.out.println("Array is full");
		  }
		  }
	  }
  
  
  void display(){
	  System.out.println("\nRunning display in store ");
	  if(screens!=null){
		  for(int start=0;start<this.index;start++){
			  if(this.screens[start]!=null){
				  System.out.println("\nElement at index:"+start);
				  this.screens[start].info();
			  }
			  
			  
		  }
		  
		  
	  }
	  else{
		  System.out.println("Array is null.Nothing to display");
	  }
  }
 
  }
  
  
  
  



