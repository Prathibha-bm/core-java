class FoodItems{
	
	static String[] getIngredientsByingredients(String name){
		
		System.out.println("\nExecuting getIngredientsByingredients :"+name);
		
		if(name==null){
			System.out.println("\nInvalid");
				    return null;
			}
		else if(name=="Dosa"){
			String[] ingredients={"water","rice flour","fenugreek","moong dal"};
			System.out.println("\nIngredients:");
			    return ingredients;
			}
			
		else if(name=="Palav"){
			String[] ingredients={"rice", "vegetables", "onion", "green chilli", "ginger", "garlic", "spices", "oil"};
			System.out.println("\nIngredients:");
			    return ingredients;
			}
			
		else if(name=="Payasa"){
			String[] ingredients={"milk", "sugar", "rice", "cardamom", "cashews", "raisins"};
			System.out.println("\nIngredients:");
			    return ingredients;
			}
			

		else if(name=="Pongal"){
			String[] ingredients={"rice", "moong dal", "black pepper", "ginger", "ghee", "cumin"};
			System.out.println("\nIngredients:");
			    return ingredients;
			}
			
			
		else if(name=="Curd Rice"){
			String[] ingredients={"rice", "curd", "salt", "mustard seeds", "curry leaves", "green chilli"};
			System.out.println("\nIngredients:");
			    return ingredients;
			}
			
		else if(name=="Bisi Bele Bath"){
			String[] ingredients={"rice", "toor dal", "vegetables", "tamarind", "bisi bele bath powder", "ghee"};
			System.out.println("\nIngredients:");
			    return ingredients;
			}
			
			
		else if(name=="Idly"){
			String[] ingredients={"rice", "urad dal", "fenugreek", "salt", "water"};
			
			System.out.println("\nIngredients:");
			    return ingredients;
			}
			
		else if(name=="Chapathi"){
			String[] ingredients={"wheat flour", "water", "salt", "oil"};
			System.out.println("\nIngredients:");
			    return ingredients;
			}
			
		else if(name=="Sambar"){
			String[] ingredients={"toor dal", "tamarind", "vegetables", "sambar powder", "mustard seeds", "curry leaves"};
			System.out.println("\nIngredients:");
			    return ingredients;
			}
			
		else if(name=="Dal Kichadi"){
			String[] ingredients={"rice", "moong dal", "turmeric", "salt", "ghee"};
			System.out.println("\nIngredients:");
			    return ingredients;
			}
		else if(name=="Upma"){
			String[] ingredients={"rava", "onion", "green chilli", "mustard seeds", "curry leaves", "oil"};
			System.out.println("\nIngredients:");
			    return ingredients;
			}
			
		else if(name=="Figure Rice"){
			String[] ingredients={"water","rice flour","fenugreek","moong dal"};
			System.out.println("\nIngredients:");
			    return ingredients;
			}
			
		else if(name=="Jeera rice"){
			String[] ingredients={"rice", "cumin seeds", "ghee", "bay leaf", "salt"};
			System.out.println("\nIngredients:");
			    return ingredients;
			}
			
	
		else if(name=="Gulab Gamun"){
			String[] ingredients={"khoya", "maida", "sugar", "cardamom", "ghee", "oil"};
			System.out.println("\nIngredients:");
			    return ingredients;
		}
			
		else if(name=="Pannir Butter Masala"){
			String[] ingredients={"paneer", "butter", "tomato", "cream", "spices", "garlic"};
			System.out.println("\nIngredients:");
			    return ingredients;
			}
			
		else if(name=="Ragi Soup"){
			String[] ingredients={"ragi flour", "water", "salt", "pepper", "garlic"};
			System.out.println("\nIngredients:");
			    return ingredients;
			}
			
		else if(name=="Poori"){
			String[] ingredients={"wheat flour", "oil", "salt", "water"};
			System.out.println("\nIngredients:");
			    return ingredients;
			}
			
		else if(name=="Tomato Bath"){
			String[] ingredients={"rice", "tomato", "onion", "spices", "oil"};
			System.out.println("\nIngredients:");
			    return ingredients;
			}
			
		else if(name=="Puliyogre"){
			String[] ingredients={"rice", "tamarind", "groundnuts", "curry leaves", "mustard seeds", "spices"};
			System.out.println("\nIngredients:");
		    return ingredients;
			}
			
		else if(name==" EggRice"){
			String[] ingredients={"rice", "egg", "onion", "green chilli", "soy sauce", "oil"};
			System.out.println("\nIngredients:");
		    return ingredients;
			}
			
		else if(name=="Roti"){
			String[] ingredients={"wheat flour", "water", "salt"};
			System.out.println("\nIngredients:");
		    return ingredients;
			}
			
		else if(name=="Vada Pav"){
			String[] ingredients={"potato", "bread", "gram flour", "garlic chutney", "green chilli"};
			System.out.println("\nIngredients:");
		    return ingredients;
			}
			
		else if(name=="Kara Bath"){
			String[] ingredients={"rava", "vegetables", "spices", "mustard seeds", "curry leaves"};
			System.out.println("\nIngredients:");
		    return ingredients;
			}
			
		else if(name=="Kesari Bath"){
			String[] ingredients={"rava", "sugar", "ghee", "cardamom", "cashews"};
			System.out.println("\nIngredients:");
		    return ingredients;
			}
			
			
		else if(name=="Vangi Bath"){
			String[] ingredients={"rice", "brinjal", "vangi bath powder", "tamarind", "oil"};
			System.out.println("\nIngredients:");
		    return ingredients;
			}
			
		else if(name=="Hobbattu"){
			String[] ingredients={"maida", "chana dal", "jaggery", "cardamom", "ghee"};
			System.out.println("\nIngredients:");
		    return ingredients;
			}
			
		else if(name=="Nippattu"){
			String[] ingredients={"rice flour", "maida", "groundnuts", "chilli", "curry leaves"};
			System.out.println("\nIngredients:");
		    return ingredients;
			}
			
		else if(name=="Vada"){
			String[] ingredients={"urad dal", "green chilli", "ginger", "curry leaves", "oil"};
			System.out.println("\nIngredients:");
		    return ingredients;
			}
			
			
		else if(name=="Poha"){
			String[] ingredients={"flattened rice", "onion", "green chilli", "mustard seeds", "curry leaves"};
			System.out.println("\nIngredients:");
		    return ingredients;
			}
			
		else if(name=="Biriyani"){
			String[] ingredients={"rice", "chicken/vegetables", "spices", "yogurt", "onion", "garlic", "ginger"};
			System.out.println("\nIngredients:");
		    return ingredients;
			}	
			
		else{
				System.out.println("Not found");
				    return null;
			}

		}
}
			
         
