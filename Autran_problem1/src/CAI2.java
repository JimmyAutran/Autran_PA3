import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI2 {
	
	
public static void main(String[] args) {
	CAI2 c= new CAI2();
	c.quiz();
	
}

public void quiz()
{
	Random rand = new SecureRandom();
	// 0 to 9 inclusive.
	int number1 = rand.nextInt(10);	
	int number2 = rand.nextInt(10);	
	askQuestion( number1, number2);
	int correctans=number1*number2;
	
	while(true)
	{
		if(readResponse(correctans)==true)
			{displayCorrectResponse();
			
			break;}
		else
			{displayInorrectResponse();
			askQuestion( number1, number2);
		
			}
			
		
	}
	
}


public void askQuestion(int number1,int number2)
{
	System.out.println("How much is "+number1+" times "+number2+"?");
	}
public boolean readResponse(int correctans )
{
	Scanner input = new Scanner(System.in);
	int ans=input.nextInt();
	
	
	if( isAnswerCorrect(ans,correctans)==true)
		return true;
	else
		return false;
}

public boolean isAnswerCorrect(int ans,int correctans)
{
	if(ans==correctans)
	{
	return true;	
	}
	else
	{
	return false;	
	}
	
}

public void displayCorrectResponse()
{
	Random rand = new SecureRandom();
	// 0 to 9 inclusive.
	int number = rand.nextInt(4);	
	
	/*if(number==0)
	{
		System.out.println("Very good!" );
	}
	else if(number==1)
	{
	System.out.println("Excellent!");	
	}
	else if(number==2)
	{System.out.println("Nice work!");	
		
	}
	else if(number==3)
	{
		System.out.println("Keep up the good work!");	
	}
*/
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




public void displayInorrectResponse()
{
	Random rand = new SecureRandom();
	// 0 to 9 inclusive.
	int number = rand.nextInt(4);	
	
	
	/*if(number==0)
	{System.out.println("No. Please try again." );	
		
	}
	else if(number==1)
	{
		System.out.println("Wrong. Try once more.");	
	}
	else if(number==2)
	{
		System.out.println("Don’t give up!");	
	}
	else if(number==3)
	{
		System.out.println("No. Keep trying.");	
	}
*/
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