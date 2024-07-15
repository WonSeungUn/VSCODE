package kcc_cafe;

public class Coupon {
	private String couponName;
	private double rate;
	
	public Coupon() {
		
	}

	public Coupon(String couponName, double rate) {
		super();
		this.couponName = couponName;
		this.rate = rate;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
}
