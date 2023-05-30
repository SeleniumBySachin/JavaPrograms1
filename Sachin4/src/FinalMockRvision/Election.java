package FinalMockRvision;


class AgeException extends RuntimeException{
	
}

public class Election {
	String name;
	int age;
	Election(){}
	public Election(String name, int age) {
		super();
		this.name = name;
		if(age>20) {
			this.age=age;
		}else
			throw new AgeException();
	}
	@Override
	public String toString() {
		return "Election [name=" + name + ", age=" + age + "]";
	}
	
}
