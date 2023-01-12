package practice;

public class MainClass {

	public static void main(String[] args) {

		BankAccount myAcc = new BankAccount("010-2422-2356", 50_000);
		BankAccount yourAcc = new BankAccount("010-3526-4264", 100_000);
		
		myAcc.transfer(yourAcc, 100_000);
		//myAcc.deposit(6000);
		myAcc.withdrawal(60000);
		myAcc.transfer(yourAcc, 5000);
		yourAcc.transfer(myAcc, 50000);
		
		System.out.println();
		myAcc.inquiry();
		yourAcc.inquiry();
	}

}
