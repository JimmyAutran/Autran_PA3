import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI1 {
	
	
public static void main(String[] args) {
	CAI1 c= new CAI1();
	c.quiz();
	
}

public void quiz(){
	
	Random rand = new SecureRandom();
	
	// 0 to 9 inclusive.
	int number1 = rand.nextInt(10);	
	int number2 = rand.nextInt(10);	
	
	askQuestion( number1, number2);
	int correctans=number1*number2;
	
	while(true){
		
		if(readResponse(correctans)==true){
			
			displayCorrectResponse();
			break;
		}
		else{
			
		displayInorrectResponse();
		askQuestion( number1, number2);
		}
		
	}
	
}

public void askQuestion(int number1,int number2){
	
	System.out.println("How much is "+number1+" times "+number2+"?");
	}

public boolean readResponse(int correctans ){
	
	Scanner input = new Scanner(System.in);
	int ans=input.nextInt();
	
	if( isAnswerCorrect(ans,correctans)==true)
		return true;
	else
		return false;
}

public boolean isAnswerCorrect(int ans,int correctans){
	
	if(ans==correctans){
		
	return true;	
	}
	
	else{
		
	return false;	
	}
	
}

public void displayCorrectResponse(){
	
	System.out.println("Very good!" );
}

public void displayInorrectResponse(){
	
	System.out.println("No. Please try again." );
	
	}
}