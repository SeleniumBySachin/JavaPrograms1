package Part2Revision;
class Phone{
	private int pwd;
	Phone(){}
	public Phone(int pwd) {
		super();
		this.pwd = pwd;
	}
	int getPhone() {
		return pwd;
	}
	void setPhone(int pwd) {
		this.pwd=pwd;
	}
}
public class Encapasulation {
	public static void main(String[] args) {
		Phone p=new Phone(123);
		System.out.println(p.getPhone());
		p.setPhone(100);
		System.out.println(p.getPhone());
	}

}
