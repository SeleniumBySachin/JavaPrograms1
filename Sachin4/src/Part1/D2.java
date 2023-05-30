package Part1;
class D3{
	int i=10;
}
class D4 extends D3{
	int j=20;
}
public class D2 {
	public static void main(String[] args) {
		D4 obj=new D4();
		System.out.println(obj.j);
		D4 obj1=(D4)obj;
		System.out.println(obj1.i);
		System.out.println(obj1.j);
	}
}
