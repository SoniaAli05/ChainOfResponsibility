package chainOfResponsibility2;

public interface GivingChain {
	
	public void setNextChain(GivingChain nextChain);
	
	public void givingAmount(MoneyGiven moneyGiven);
	
}