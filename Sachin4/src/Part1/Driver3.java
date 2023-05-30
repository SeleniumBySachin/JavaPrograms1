package Part1;

class Mobile{
	private static int password;
	Mobile(){}
	Mobile (int password){
		this.password=password;
	}
	public int getPass() {
		return password;
	}
	public void setPass(int pass) {
		this.password=pass;
	}
}
public class Driver3 {
  public static void main(String[] args) {
	Mobile b=new Mobile(1234);
	System.out.println(b.getPass());
	b.setPass(1000);
	System.out.println(b.getPass());
}
}
