package exceptions;

import rocketData.LoanRequest;

public class RateException extends Exception {

private LoanRequest lq = new LoanRequest();
	
	public RateException(LoanRequest lq) {
		this.lq = lq;
	}
	
	public LoanRequest getModel() {
		return lq;
	}
}
