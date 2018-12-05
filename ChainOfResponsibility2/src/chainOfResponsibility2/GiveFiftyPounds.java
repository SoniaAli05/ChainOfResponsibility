package chainOfResponsibility2;

public class GiveFiftyPounds implements GivingChain {
	
	private GivingChain giveChain;
	
	@Override
	public void setNextChain(GivingChain nextChain) {
		this.giveChain = nextChain;
	}
	
	@Override
	public void givingAmount(MoneyGiven moneyGiven) {
		if(moneyGiven.getAmount() >= 50){
			int num = moneyGiven.getAmount()/50;
			int remainder = moneyGiven.getAmount() % 50;
			System.out.println(num+" £50 note has been dispensed");
			if(remainder !=0) this.giveChain.givingAmount(new MoneyGiven(remainder));
		}
		else{
			this.giveChain.givingAmount(moneyGiven);
		}
	
	}
}