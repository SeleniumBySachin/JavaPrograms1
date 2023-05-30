package Part2Revision;

class SA extends Account{
	int acno;
	SA(){}
	SA(int acno,double bal,String name){
		this.name=name;
		this.bal=bal;
		this.acno=acno;
	}
	void display() {
		System.out.println(acno);
		System.out.println(bal);
		System.out.println(name);
	} 
}
class Account {
	double bal;
	String name;
}
public class Driver1 {
	public static void main(String[] args) {
		SA obj=new SA(101,2000,"Sheela");
		obj.display();
	}
	

}
