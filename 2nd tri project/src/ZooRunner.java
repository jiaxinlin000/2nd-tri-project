import java.util.*; 
public class ZooRunner
	{
	private static double start= 1000.0; 
	private static int day=0; 
	private static int animals=0;
	private static ArrayList <Animal>zoo= new <Animal>ArrayList(); 
	
	
	
    
	
	public static void main(String[] args)
		{
		
		while(start>50||zoo.size()>0)
		// 50 is the cheapest animal to get. As long as there are animals on the field and have money, game continues. 

		{
			buyAnimal(); 	
			feedAnimal(); 
		}
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
			
			for(int i=0;i<zoo.size();i++)
			{
				System.out.println(i+" "+zoo.get(i).getName());
			}
			zoo.get(animals).setName(newName); 
			for(int i=0;i<zoo.size();i++)
			{
				System.out.println(i+" " +zoo.get(i).getName()+" ");
			}
			
//			System.out.println("remember to feed "+ a2.getName()+" everyday, or it will die.");
			break; 
		}
		case 2:
		{
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
			
			for(int i=0;i<zoo.size();i++)
			{
				System.out.println(i+" "+zoo.get(i).getName());
			}
			zoo.get(animals).setName(newName); 
			for(int i=0;i<zoo.size();i++)
			{
				System.out.println(i+" " +zoo.get(i).getName()+" ");
			}
			
//			System.out.println("remember to feed "+ a2.getName()+" everyday, or it will die.");
			break; 
		}
		case 3: 
		{
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
			
			for(int i=0;i<zoo.size();i++)
			{
				System.out.println(i+" "+zoo.get(i).getName());
			}
			zoo.get(animals).setName(newName); 
			for(int i=0;i<zoo.size();i++)
			{
				System.out.println(i+" " +zoo.get(i).getName()+" ");
			}
			
//			System.out.println("remember to feed "+ a2.getName()+" everyday, or it will die.");
			break; 
			
		}
		case 4:
		{
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
			
			for(int i=0;i<zoo.size();i++)
			{
				System.out.println(i+" "+zoo.get(i).getName());
			}
			zoo.get(animals-1).setName(newName); 
			for(int i=0;i<zoo.size();i++)
			{
				System.out.println(i+" " +zoo.get(i).getName()+" ");
			}
			
//			System.out.println("remember to feed "+ a2.getName()+" everyday, or it will die.");
			break; 
		}
		}

	}
	
	public static void feedAnimal()
	{
		for(int i=0; i<zoo.size();i++)
		{ 
//			System.out.println("Do you want to feed "+zoo.get(i).getName()+" ?");
//			System.out.println("its food cost "+zoo.get(i).getFoodP()+" .");
//			System.out.println("1. Yes.");
//			System.out.println("2. No");
//			Scanner keypad2= new Scanner(System.in); 
//			int feedA= keypad2.nextInt();
//			switch(feedA)
//			{
//			case 1: 
//				System.out.println("Thank you!");
//				break; 
//				
//			case 2:
//				zoo.get(i).setDayNF(zoo.get(i).getDayNF()+1);
//				if(zoo.get(i).getDayNF()==2)
//				{
//					System.out.println("T_T "+zoo.get(i).getName()+" died!");
//					zoo.remove(i);
//					i--; 
//					
//				}
//				else 
//				{
//					System.out.println("If you don't feed "+zoo.get(i).getName()+" tomorrow, it will die!");
//					
//				}
//			
//				
//			}
		}
	}

	}
