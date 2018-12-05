package chainOfResponsibility2;

public class GiveTwentyPounds implements GivingChain {
	
	private GivingChain giveChain;
	
	@Override
	public void setNextChain(GivingChain nextChain) {
		this.giveChain = nextChain;
	}
	
	@Override
	public void givingAmount(MoneyGiven moneyGiven) {
		if(moneyGiven.getAmount() >= 20){
			int num = moneyGiven.getAmount()/20;
			int remainder = moneyGiven.getAmount() % 20;
			System.out.println(num+" £20 note has been dispensed");
			if(remainder !=0) this.giveChain.givingAmount(new MoneyGiven(remainder));
		}
		else{
			this.giveChain.givingAmount(moneyGiven);
		}
	
	}
}