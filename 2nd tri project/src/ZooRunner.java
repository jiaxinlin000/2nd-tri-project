import java.util.*; 
public class ZooRunner
	{
	private static double start= 1000.0; 
	private static int day=0; 
	private static int animals=0;
	private static ArrayList <Animal>zoo= new <Animal>ArrayList(); 
	
	
	
    
	
	public static void main(String[] args)
		{
		
		while(start>=50||zoo.size()>0)
		// 50 is the cheapest animal to get. As long as there are animals on the field and have money, game continues. 

		{
			
			buyAnimal();
			System.out.println();
			feedAnimal(); 
			System.out.println();
			if(zoo.size()!=0)
				{
				sellAnimal(); 
				}
			System.out.println("You have "+start+ " left!");
			System.out.println("Your zoo looks like this");
			for(int i=0;i<zoo.size(); i++)
				{
				System.out.println(zoo.get(i).getType()+" : "+ zoo.get(i).getName());
				}
			System.out.println();
			System.out.println();
		}
		System.out.println("You have nothing left!");
		System.out.println("GAME OVER!!!!!");
	
		}
	public static void buyAnimal()
	{
		
		Animal a= new Animal(); 
		System.out.println("What animal do you want to buy?");
		System.out.println("1. fish.");
		System.out.println("2. bird.");
		System.out.println("3. pig. ");
		System.out.println("4. cat. "); 
		Scanner keypad1= new Scanner(System.in);
		int animalNumber=keypad1.nextInt();
	
		switch(animalNumber)
		{
		case 1:
		{
			if(start<50)
			{
				System.out.println("You don't have enough money to get fish! Sorry.");
			}
			else
				{
				a= new Fish();
				
			Animal a2=a; 
			zoo.add(a2); 
			
			animals++; 
			start= start-zoo.get(animals-1).getBabyP(); 
			Fish.getAnimal();
			System.out.println("A baby fish!");
			System.out.println("Give a name to this fish !");
			String newName= new String();
			newName= new Scanner(System.in).next(); 
			
			
			zoo.get(animals-1).setName(newName); 
		
			System.out.println("remember to feed "+ a2.getName()+" everyday, or it will die.");
				}
			break; 
		}
		case 2:
		{
			if(start<100)
			{
				System.out.println("You don't have enough money to get bird! Sorry.");
			}
			else
			{
			a= new Bird();
			Animal a2=a; 
			zoo.add(a2); 
			
			animals++; 
			start= start-zoo.get(animals-1).getBabyP(); 
			Bird.getAnimal();
			System.out.println("A baby bird!");
			System.out.println("Give a name to this bird !");
			String newName= new String();
			newName= new Scanner(System.in).next(); 
			
		
			zoo.get(animals-1).setName(newName); 
			
			
			System.out.println("remember to feed "+ a2.getName()+" everyday, or it will die.");
			}
			break; 
		}
		case 3: 
		{
			if(start<70)
			{
				System.out.println("You don't have enough money to get pig! Sorry.");
			}
			else
				{
				a= new Pig();
				
			Animal a2=a; 
			zoo.add(a2); 
			
			animals++; 
			start= start-zoo.get(animals-1).getBabyP(); 
			Pig.getAnimal();
			System.out.println("A baby pig!");
			System.out.println("Give a name to this pig !");
			String newName= new String();
			newName= new Scanner(System.in).next(); 
			
			
			zoo.get(animals-1).setName(newName); 
			
			
			System.out.println("remember to feed "+ a2.getName()+" everyday, or it will die.");
				}
			break; 
			
		}
		case 4:
		{
			if(start<200)
			{
				System.out.println("You don't have enough money to get cat! Sorry.");
			}
			else{
			a= new Cat();
			Animal a2=a; 
			zoo.add(a2); 
			
			animals++; 
			start= start-zoo.get(animals-1).getBabyP(); 
			Cat.getAnimal();
			System.out.println("A baby cat!");
			System.out.println("Give a name to this cat !");
			String newName= new String();
			newName= new Scanner(System.in).next(); 
			
			
			zoo.get(animals-1).setName(newName); 
		
			
			System.out.println("remember to feed "+ a2.getName()+" everyday, or it will die.");
			}
			break; 
		}
		}

	}
	
	public static void feedAnimal()

	{
		for(int i=zoo.size()-1; i>-1;i--)
		{ 
			System.out.println("Do you want to feed "+zoo.get(i).getName()+" ?");
			System.out.println("its food cost "+zoo.get(i).getFoodP()+" .");
			System.out.println("1. Yes.");
			System.out.println("2. No");
			if(start<zoo.get(i).getFoodP())
				{
				System.out.println("Sorry, you cannot afford its food!");
				zoo.get(i).setDayNF(zoo.get(i).getDayNF()+1);
				if(zoo.get(i).getDayNF()==2)
				{
					System.out.println("(>_<) "+zoo.get(i).getName()+" died!");
					zoo.remove(i);
					i--; 
					animals--; 
					
				}
				else 
				{
					System.out.println("If you don't feed "+zoo.get(i).getName()+" tomorrow, it will die!");
					
				}
				}
			else
			{
			Scanner keypad2= new Scanner(System.in); 
			int feedA= keypad2.nextInt();
			switch(feedA)
			{
			case 1: 
				System.out.println("Thank you!");
				if(zoo.get(i).getDayNF()==1)
					{
					zoo.get(i).setDayNF(0); 
					}
				start-=zoo.get(i).getFoodP(); 
				zoo.get(i).setSellP(zoo.get(i).getSellP()+1.5*zoo.get(i).getFoodP());
				
				break; 
				
			case 2:
				zoo.get(i).setDayNF(zoo.get(i).getDayNF()+1);
				if(zoo.get(i).getDayNF()==2)
				{
					System.out.println("(>_<) "+zoo.get(i).getName()+" died!");
					zoo.remove(i);
					i--; 
					animals--; 
					
				}
				else 
				{
					System.out.println("If you don't feed "+zoo.get(i).getName()+" tomorrow, it will die!");
					
				}
				break;  
			
				
			}
			}
			System.out.println();
		}
	}
	
	public static void sellAnimal()
		{
		
		for(int i=zoo.size()-1;i>-1;i--)
			{
			System.out.println("Do you want to sell "+zoo.get(i).getName()+" for "+zoo.get(i).getSellP()+" ?");
			System.out.println("1. Yes.");
			System.out.println("2. No");
			Scanner keypad3= new Scanner(System.in); 
			int sellA= keypad3.nextInt();
			switch(sellA)
			{
			case 1: 
				System.out.println("You got "+zoo.get(i).getSellP()+" !");
				
				start+=zoo.get(i).getSellP();
				zoo.remove(i);
				
				animals--; 
				break; 
				
			case 2:
				
				break;  
			}
		}
	}
	}
