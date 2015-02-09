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
		}
		
	
		}
	public static void buyAnimal()
	{
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
			zoo.add(new Fish()); 
			
			animals++; 
			start= start-Fish.getBabyP();
			Fish.getAnimal(); 
			System.out.println("The egg turns into a fish!");
			Fish.changeName(); 
			System.out.println("remember to feed "+Fish.getName() +" everyday, or it will die.");
			break; 
		}
		case 2:
		{
			zoo.add(new Bird()); 
			
			animals++; 
			start= start-Bird.getBabyP(); 
			Bird.getAnimal();
			System.out.println("The egg turns into a bird!");
			Bird.changeName(); 
			System.out.println("remember to feed "+Bird.getName()+" everyday, or it will die.");
			break; 
		}
		case 3: 
		{
			zoo.add(new Pig()); 
			
			animals++; 
			start= start-Pig.getBabyP(); 
			Pig.getAnimal();
			System.out.println("A baby pig!");
			Pig.changeName(); 
			System.out.println("remember to feed "+Pig.getName() +" everyday, or it will die.");
			break; 
			
		}
		case 4:
		{
			zoo.add(new Cat()); 
			
			animals++; 
			start= start-Cat.getBabyP(); 
			Cat.getAnimal();
			System.out.println("A baby cat!");
			Cat.changeName(); 
			System.out.println("remember to feed "+ Cat.getName()+" everyday, or it will die.");
			break; 
		}
		}

	}

	}
