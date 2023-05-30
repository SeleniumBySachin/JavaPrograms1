
public class S20 {
	public static void main(String[] args) {
		test(1);
	}
	public static void test(int i) {
		
		if(i<=100) {
			i++;
			if(i%2==0) {
				System.out.println(i);
				test(i);
			}else {
				test(i);
			}
		}else {
			return ;
		}
	}

}
