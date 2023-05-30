
public class S1 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("Hii");
		Thread.sleep(2000);
		System.out.println("Byee");


		try{
			
			Thread.sleep(1000);
			System.out.println("Hi");
		}

		catch(Exception e) {
			System.out.println("Bye");
		}
	}

}
