package Part1;
class F{
	int i=10;
}
class E extends F{
	int j=20;
}
public class A4 {
	public static void main(String[] args) {
		F obj=new E();
		System.out.println(obj.i);
		E obj1=(E)obj;
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		System.out.println();
	}

}
