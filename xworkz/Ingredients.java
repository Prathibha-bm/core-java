class Ingredients{
	
	public static void main(String[] args){
		String[] foods={"Dosa", "Palav","Payasa","Pongal","Curd Rice","Bisi Bele Bath","Idly","Chapathi","Sambar","Dal Kichadi","Upma","Figure Rice","Jeera rice","Gulab Gamun","Pannir Butter Masala","Ragi Soup","Poori","Tomato Bath","Puliyogre","EggRice","Roti","Vada Pav","Kara Bath","Kesari Bath","Vangi Bath","Hobbattu","Nippattu","Vada","Poha","Biriyani"};
		
			for (int item=0;item<foods.length;item++)
			{
			    String[] ingr = FoodItems.getIngredientsByingredients(foods[item]);
				
				
				if (ingr != null) {
					for(int ing=0;ing<ingr.length;ing++){
						
					System.out.println(ingr[ing]);
			}

			}
			}
	}
}

