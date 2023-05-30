package Grooming;

class AgeException extends RuntimeException{
	
}
class Election{
	String name;
	double age;
	Election(){}
	public Election(String name, double age) {
		super();
		this.name = name;
		if(age>18) {
			this.age=age;
		}else {
			throw  new AgeException();
		}
	}
   
}
public class DriverException {
	public static void main(String[] args) {
		Election e=new Election("Sheela",18);
		System.out.println(e.name);
		System.out.println(e.age);
	}

}
