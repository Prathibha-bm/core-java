class RestaurantChild extends Restaurant{

@Override
void display(String name){
	 System.out.println("Name :"+name);
	 
 }
 
 @Override
 void display(double ratings){
	 System.out.println("ratings :"+ratings);
 }
 
 
 @Override
 void display(double ratings,String location){
	 System.out.println("ratings :"+ratings);
	 System.out.println("location :"+location);
 }

}