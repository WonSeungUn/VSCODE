package kcc_cafe;

public class Customer {
	private String name;
	private Coupon coupon;
	
	public Customer() {
		
	}
	
	
	
	public Customer(String name) {
		super();
		this.name = name;
		this.coupon = createCoupon();
	}



	public Coupon createCoupon() {
		return new Coupon("ÃÑ ÇÒÀÎÄíÆù", 0.1);
	}



	public int setCoupon(int total) {
		return (int)(total * coupon.getRate());
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
}
