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
		
		raisedD=0; 
		dayNF=0; 
		
		
	}
	public void changeName()
	{
		
		
	}

}
