import java.util.*; 
public class Fish extends Oviparous{
//	protected double babyP;
//	protected String name; 
//	protected double foodP;
//	protected double sellP;
// protected String type; 
//	protected int raisedD;

//	protected fly flyB; 
//	protected climb climbB;
//	protected swim swimB; 
//	protected eat eatB; 
//	
	public Fish()
	{
		babyP=50.0;
		
		foodP=5.0;
		
		sellP=25.0;
		
		flyB=(fly)new CannotFly(); 
		
		climbB=(climb)new CannotClimb(); 
		
		swimB=(swim)new CanSwim();
		
		eatB=(eat)new CannotEat();  
		
		type= "Fish"; 
		
		
		
	}
	public static void changeName()
	{
		System.out.println("Give a name to this "+ type+" !");
		Scanner keyboard= new Scanner(System.in); 
		String newName= keyboard.nextLine(); 
		Bird.setName(newName); 
		
		
	}
}
