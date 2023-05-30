package Part3Revision;

public class D9 {
	public static void main(String[] args) {
		String s ="Sheela@145&";
		int upp=0;
		int low=0;
		int spl=0;
		int num=0;
		
		for(int i=0;i<s.length();i++) {
		char  ch=s.charAt(i);
		  if(ch>='A'&&ch<='Z') {
			  upp++;
		  }
		  else if(ch>='a'&&ch<='z') {
			  low++;
		  }
		  else if(ch>='0'&&ch<'9') {
			  num++;
		  }
		  else
			  spl++;
		}
		System.out.println("Upp: "+upp);
		System.out.println("Low: "+low);
		System.out.println("Spl: "+spl);
		System.out.println("Num: "+num);
	}	
		
   }


