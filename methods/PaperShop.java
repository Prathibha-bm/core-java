class PaperShop{
public static void main(String[] args){
	Paper.details();
	
	float height=18.34f;
	double weight=10;
	int cost=20;
	boolean goodQuality=true;
	float width=0.22f;
	Paper.feature(height, weight, cost, goodQuality, width);
	Paper.feature(18.34f,20,25,true,0.22f);
	
}
}
