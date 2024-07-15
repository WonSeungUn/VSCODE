package kcc_cafe;

// 원두 종류 2가지 : 케냐, 에티오피아
public class Bean {
	private String beanName;
	private int beanPrice;
	
	public Bean() {
		
	}

	public Bean(String beanName, int beanPrice) {
		super();
		this.beanName = beanName;
		this.beanPrice = beanPrice;
	}

	public int getBeanPrice() {
		return beanPrice;
	}

	public void setBeanPrice(int beanPrice) {
		this.beanPrice = beanPrice;
	}

	public void beanInfo() {
		System.out.println("원두 이름 : " + beanName + " 가격 : " + beanPrice + " 원");
	}
	
	
}
