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
		
		raisedD=0; 
		dayNF=0; 
		
		
		
	}
	public  void changeName()
	{
		
		
	}
}
