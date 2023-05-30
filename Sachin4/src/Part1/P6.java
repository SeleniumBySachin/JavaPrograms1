package Part1;
/*
 * Three machine are manufactured in the industry
 * Give the unique product id for each and every machine
 * Manufactued automatically and serially
 * */
public class P6 {
	static String name="SANSERA";
	String pid;
    static String machinaName="CNC";
    static int count=100;
    {
    	pid=name+machinaName+ ++count;
    }
    P6(){}
	void display() {
		System.out.println("Company name: "+name);
		
		System.out.println("Product id  : "+pid);
	}

}
