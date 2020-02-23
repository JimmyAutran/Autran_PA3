import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI5 {	

public static void main(String[] args) {
	CAI5 c= new CAI5();
	c.quiz();	
}

public void quiz(){
	
	Random rand = new SecureRandom();
	
	int o=readProblemType();
	int r=readDifficulty();
	// 0 to 9 inclusive.
	int number1 ;	
	int number2;	
	while(true){
	
	int correctans = 0;
	int score=0;
	
	for(int i=0;i<10;i++){
		
		number1 = generateQuestionArgument(r);	
		 number2 =generateQuestionArgument(r);	
		 if(o==1){
		
		askQuestion( number1, number2,o);
		 correctans=number1+number2;
		 }
		 
		 else if(o==2){
			 
			 askQuestion( number1, number2,o);
				 correctans=number1*number2;
		 }	 
			 
		 else if(o==3){
			 
			 askQuestion( number1, number2,o);
				 correctans=number1-number2; 
		 }	
		 else if(o==4){
			while(number2 == 0){
				number2 = generateQuestionArgument(r);
			}
			askQuestion( number1, number2,o);

			 correctans=number1/number2;
		 }	
		 
		 else if(o==5){
			 
			 int mix = generateQuestionArgument(4);
			 mix++; // add 1 (no zero range is 1 to 4)
			 
			 if(mix==1){
				 
				 askQuestion( number1, number2,mix);
				 correctans=number1+number2;
			 }
			 
			 else if(mix==2){
				 
				 askQuestion( number1, number2,mix);
				 correctans=number1*number2;
			 }
			 
			 else if(mix==3){
				 
				 askQuestion( number1, number2,mix);
				 correctans=number1-number2;
				 
			 }
			 
			 else if(mix==4){
				 while(number2 == 0){
					number2 = generateQuestionArgument(r);
				}
				askQuestion( number1, number2,mix);
				
				correctans=number1/number2;
			 }

		 }	
		 
		if(readResponse(correctans)==true){
			
			score++;
			displayCorrectResponse();
			}
		
		else{
			
			displayInorrectResponse();
			}
			
	}
	
	displayCompletionMessage(score);

	Scanner input = new Scanner(System.in);
	System.out.println("Do you want to try again?(y/n): ");
	String ans=input.next();
	
	if (ans.equals("n"))
		break;
	}

}


public int generateQuestionArgument(int r){
	
	Random rand = new SecureRandom();
	return rand.nextInt(r);	
}

public void askQuestion(int number1,int number2,int o){


	if(o==1){
	
		System.out.println("How much is "+number1+" plus "+number2+"?");
	}

	else if(o==2){
	
		System.out.println("How much is "+number1+" times "+number2+"?");
	}	 
	 
	else if(o==3){
	
		System.out.println("How much is "+number1+" minus "+number2+"?"); 
	}	
	
	else if(o==4){
	
		System.out.println("How much is "+number1+" divide "+number2+"?");
		
	}	
	
}

public int readOperation(){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Select Arithmetic Operation 1 => +, 2 => *, 3 => -, 4 => / and 5 => mix equations: ");
	
	int o=input.nextInt();
	return o;
	
}
public int readProblemType(){
	
	return readOperation();
}

public int readDifficulty(){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a difficulty level of 1, 2, 3, or 4: ");
	
	int level=input.nextInt();
	int r=0;
	
	if(level==1){
		
		r=10;
	}
	
	else if(level==2){
		
		r=100;
	}
	
	else if(level==3){
		
		r=1000;
	}
	
	else if(level==4){
		
		r=10000;
	}
	
	return r;
}

public void displayCompletionMessage(int score){
	
	if(((float)score/10)>=0.75){
		
		System.out.println("Your Result is "+((float)score/10)*100+"%");
		System.out.println("Congratulations, you are ready to go to the next level!");
	}
	
	else{
	
	System.out.println("Your Result is "+((float)score/10)*100+"%");
	System.out.println("Please ask your teacher for extra help.");	
	}	
	
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
	
	Random rand = new SecureRandom();
	// 0 to 9 inclusive.
	int number = rand.nextInt(4);	
	
	switch(number) {
	
	case 0:
		System.out.println("Very good!" );
		break;
		
	case 1:
		System.out.println("Excellent!" );
		break;
		
	case 2:
		System.out.println("Nice work!");
		break;
		
	case 3:
		System.out.println("Keep up the good work!");
		break;
	}
	
}

public void displayInorrectResponse(){
	
	Random rand = new SecureRandom();
	// 0 to 9 inclusive.
	int number = rand.nextInt(4);	
	
		switch(number) {
	
		case 0:
			System.out.println("No. Please try again." );
			break;
		
		case 1:
			System.out.println("Wrong. Try once more." );
			break;
		
		case 2:
			System.out.println("Don’t give up!");
			break;
		
		case 3:
			System.out.println("No. Keep trying.");
			break;
		}
	
	}
}		
