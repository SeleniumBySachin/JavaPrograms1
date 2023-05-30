package Part1;
class S1{
	S1(int i){
		System.out.println("Hi");
	}
	S1(){}
}
public class S extends S1 {

	public static void main(String[] args) {
		new S1(10);
	}

}
