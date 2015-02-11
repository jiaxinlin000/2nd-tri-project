

import java.util.*;
public class Pig extends Mammal{
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
	public Pig()
	{
		babyP=70.0;
		
		foodP=20.0;
		
		sellP=40.0;
		
		flyB=(fly)new CannotFly(); 
		
		climbB=(climb)new CannotClimb(); 
		
		swimB=(swim)new CannotSwim();
		
		eatB=(eat)new CanEat();  
		
		type= "Pig"; 
		
		raisedD=0; 
		
		dayNF=0; 
		
	}
	public void changeName()
	{
		System.out.println("Give a name to this "+ type+" !");
		Scanner keyboard= new Scanner(System.in); 
		String newName= keyboard.nextLine(); 
		Pig.setName(newName); 
		
		
	}

}
