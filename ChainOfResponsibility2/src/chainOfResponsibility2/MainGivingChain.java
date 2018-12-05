package chainOfResponsibility2;
import java.util.Scanner;
public class MainGivingChain {

	public static void main(String[] args) {
		Chain money = new Chain();
		
		while(true) {
			int enteredAmount = 0;
		System.out.println("Please enter the amount of money you wish to give Sonia: ");
		Scanner userinput = new Scanner(System.in);
		enteredAmount = userinput.nextInt();
		
		if(enteredAmount % 10!=0) {
			System.out.println("Error - Could not carry out request.");
			return;
		}
		
		money.One.givingAmount(new MoneyGiven(enteredAmount));
	}

}
}

