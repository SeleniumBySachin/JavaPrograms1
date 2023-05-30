package FinalMockRvision;

public class Ex1 {
	public static void main(String[] args) {
		  try {
			  int a=10;
			  int b=0;
			  int res=a/b;
			  System.out.println(res);
		  }catch(Exception e) {
			  System.out.println("Exception is handled");
		  }finally {
			  System.out.println("Thanks for using this application");
		  }
	}

}
