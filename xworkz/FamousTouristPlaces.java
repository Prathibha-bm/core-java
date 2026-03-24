class FamousTouristPlaces{
	
	public static void main(String[] args){
		
		String placeName1="Hampi";
		String placeName2="Mysore Palace";
		String placeName3="Coorg (Madikeri)";
		String placeName4="Jog Falls";
		String placeName5="Gokarna Beaches";
		String placeName6="Chikmagalur";
		String placeName7="Badami Caves";
		String placeName8="Belur and Halebidu";
		String placeName9="Bandipur National Park";
		String placeName10="Nandi Hills";
		String placeName11="Taj Mahal, Agra";
		String placeName12="Jaipur, Rajasthan";
		String placeName13="Munnar";
		String placeName14="Goa Beaches";
		String placeName15="Leh-Ladakh";
		String placeName16="Varanasi, Uttar Pradesh";
		String placeName17="Shimla, Himachal Pradesh";
		String placeName18="Srinagar, Kashmir";
		String placeName19="Ooty, Tamil Nadu";
		String placeName20="Rishikesh, Uttarakhand";
		String placeName21="Eiffel Tower, Paris";
		String placeName22="Burj Khalifa, Dubai";
		String placeName23="Maldives Islands";
		String placeName24="Swiss Alps, Switzerland";
		String placeName25="Santorini";
		String placeName26="Colosseum";
		String placeName27="Statue of Liberty";
		String placeName28="Great Wall of China";
		String placeName29="Machu Picchu, Peru";
		String placeName30="Ooty";


			String[] placesName={placeName1,placeName2,placeName3,placeName4,placeName5,placeName6,placeName7,placeName8,placeName9,placeName10,placeName11,placeName12,placeName13,placeName14,placeName15,placeName16,placeName17,placeName18,placeName19,placeName20,placeName21,placeName22,placeName23,placeName24,placeName25,placeName26,placeName27,placeName28,placeName29,placeName30};
			
			placesName[5]="Eiffel Tower";
			
			for(int place=0;place<=29;place++){
			System.out.println(placesName[place]);
			}
			
			System.out.println("\n Reverse :\n");
			
			for(int place=29;place>=0;place--){
			System.out.println(placesName[place]);
			}
			
			String item2=placesName[39];
		}
}
