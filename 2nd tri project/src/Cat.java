import java.util.Scanner;


public class Cat extends Mammal{
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
	public Cat()
	{
		babyP=200.0;
		
		foodP=10.0;
		
		sellP=100.0;
		
		flyB=(fly)new CannotFly(); 
		
		climbB=(climb)new CanClimb(); 
		
		swimB=(swim)new CannotSwim();
		
		eatB=(eat)new CannotEat();  
		
		type= "Cat"; 
		
		raisedD=0; 
		dayNF=0; 
		
		
		
		
		
	}
	

}
