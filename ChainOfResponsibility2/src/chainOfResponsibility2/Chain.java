package chainOfResponsibility2;

public class Chain {

	GivingChain One;
	GivingChain Two;
	GivingChain Three;
	
	public Chain() {
		this.One = new GiveFiftyPounds();
		this.Two = new GiveTwentyPounds();
		this.Three = new GiveTenPounds();
		
		One.setNextChain(Two);
		Two.setNextChain(Three);

	}
}

