package kcc_cafe;

// ���� ���� 2���� : �ɳ�, ��Ƽ���Ǿ�
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
		System.out.println("���� �̸� : " + beanName + " ���� : " + beanPrice + " ��");
	}
	
	
}
