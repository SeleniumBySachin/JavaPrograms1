package FinalMockRvision;
//read name from command line and print no of character is present
public class Comm3 {
	public static void main(String[] args) {
		for (int i= 0;  i< args.length; i++) {
			System.out.println(args[i]+"===>"+args[i].length());
		}
	}

}
