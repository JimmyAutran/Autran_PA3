
public class SavingsAccountTest {

public static void main(String[] args) {

	SavingsAccount saver1 = new SavingsAccount(2000);
	saver1.modifyInterestRate(4);
	
	SavingsAccount saver2 = new SavingsAccount(3000);
	saver2.modifyInterestRate(4);
	
	System.out.println("For 4%");
	
	for(int i=0;i<12;i++){
	
	saver1.calculateMonthlyInterest();
	System.out.println("Saver 1 SavingBalance for month "+(i+1)+" "+saver1.getSavingsBalance());

	saver2.calculateMonthlyInterest();
	System.out.println("Saver 2 SavingBalance for month "+(i+1)+" "+saver2.getSavingsBalance());

}

	saver2.modifyInterestRate(5);
	saver1.modifyInterestRate(5);
	
	System.out.println("For 5%");
	
	for(int i=0;i<12;i++){
		
		saver1.calculateMonthlyInterest();
		System.out.println("Saver 1 SavingBalance for month "+(i+1)+" "+saver1.getSavingsBalance());
		
		saver2.calculateMonthlyInterest();
		System.out.println("Saver 2 SavingBalance for month "+(i+1)+" "+saver2.getSavingsBalance());

	}

}
}