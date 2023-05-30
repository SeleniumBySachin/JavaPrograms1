package Grooming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A {
	public static void main(String[] args) {
		Collection ls=new ArrayList();
		ls.add(10);
		Iterator i=ls.iterator();
		for(Object o:ls) {
			System.out.println(o);
		}
	}

}
