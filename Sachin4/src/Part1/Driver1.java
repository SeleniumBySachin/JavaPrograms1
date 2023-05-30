package Part1;
class Bank{
	Account a;
}
class Account{
	String name;
	double bal;
	
}
class SA extends Account{
	int acno;
	SA(){}
	public SA(int a,String b,double c) {
		acno = a;
		name=b;
		bal=c;
	}
}
public class Driver1 {
	public static void main(String[] args) {
		Bank b=new Bank();
		b.a=new SA(101,"Sheela",10000);
		System.out.println(b.a.bal);
	}

}
