package chainOfResponsibility2;

public class GiveTenPounds implements GivingChain {
	
	private GivingChain giveChain;
	
	@Override
	public void setNextChain(GivingChain nextChain) {
		this.giveChain = nextChain;
	}
	
	@Override
	public void givingAmount(MoneyGiven moneyGiven) {
		if(moneyGiven.getAmount() >= 10){
			int num = moneyGiven.getAmount()/10;
			int remainder = moneyGiven.getAmount() % 10;
			System.out.println(num+" £10 note has been dispensed");
			if(remainder !=0) this.giveChain.givingAmount(new MoneyGiven(remainder));
		}
		else{
			this.giveChain.givingAmount(moneyGiven);
		}
	
	}
}