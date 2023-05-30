package Part3Revision;

class Account{
	int acno;
	String name;
	Account(){}
	Account(String name,int acno){
		this.name=name;
		this.acno=acno;
	}
	@Override
	public String toString() {
		return "Account [acno=" + acno + ", name=" + name + "]";
	}
}
public class SA extends Account{
	double bal;
	SA(){}
	SA(double bal,String name,int acno){
		super(name,acno);
		this.bal=bal;
	}
	
	@Override
	public String toString() {
		super.toString();
		return "SA [bal=" + bal + "]";
	}

}


