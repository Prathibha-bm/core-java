class Restaurant{

 
 void display(String name){
	 System.out.println("\nName :"+name);
	 
 }
 void display(double ratings){
	 System.out.println("\nRatings :"+ratings);
 }
 
 void display(double ratings,String location){
	 System.out.println("\nRatings :"+ratings);
	 System.out.println("location :"+location);
 }
 
 void display(double ratings,String location,boolean vagitarian){
	 System.out.println("\nratings :"+ratings);
	 System.out.println("location :"+location);
	 System.out.println("vagitarian :"+vagitarian);
 }
 
 void display(String location,boolean vagitarian){
	 System.out.println("\nratings :"+location);
	 System.out.println("ratings :"+vagitarian);
 }
 
}