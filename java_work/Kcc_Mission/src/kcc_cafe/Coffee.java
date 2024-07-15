package kcc_cafe;

public class Coffee {
	private String coffeeName;
	private Bean bean;
	private int coffeePrice;
	
	public Coffee() {
		
	}

	public Coffee(String coffeeName, Bean bean, int coffeePrice) {
		super();
		this.coffeeName = coffeeName;
		this.bean = bean;
		this.coffeePrice = coffeePrice;
	}

	public int getPrice() {
		return this.coffeePrice + bean.getBeanPrice(); 
	}

	public void getInfo() {
		System.out.println(coffeeName + ": " + getPrice());
		bean.beanInfo();
		System.out.println("기본가격 : " + coffeePrice + " 원");
	}
	
}
