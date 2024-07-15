package kosa.api;

public class Person {
	private String name;
	private int age;
	
	public Person() {}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

	@Override
	public boolean equals(Object obj) {
		// Object 가 Person의 부모 이므로 obj를 다운 캐스팅해서 person과 같은 값으로 만들자
		Person p = (Person)obj;
		if(name.equals(p.getName()) && age == p.getAge()) {
			return true;
		} else {
			return false;
		}
	}
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
