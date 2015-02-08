import java.util.*; 
public class Bird extends Oviparous {
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
	public Bird()
	{
		babyP=100.0;
		
		foodP=5.0;
		
		sellP=50.0;
		
		flyB=(fly)new CanFly(); 
		
		climbB=(climb)new CannotClimb(); 
		
		swimB=(swim)new CannotSwim();
		
		eatB=(eat)new CannotEat();  
		
		type= "Bird"; 
		
		
		
	}
	public void changeName()
	{
		System.out.println("Give a name to this "+ type+" !");
		Scanner keyboard= new Scanner(System.in); 
		String newName= keyboard.nextLine(); 
		Bird.setName(newName); 
		
		
	}

}
