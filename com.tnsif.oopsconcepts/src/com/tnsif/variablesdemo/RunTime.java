package com.tnsif.variablesdemo;

public class RunTime { 
	public void message() {
		System.out.println("this is in 1st class") ;
	}
 

}


class Ctime extends RunTime {
	public void message() {
		System.out.print("this is 2nd class");
	
}
	
	
}

class Main {
	public static void main (String args[] ) {
		
		RunTime r = new RunTime() ;
		Ctime c = new Ctime();
		
//		System.out.print(r.message()); 
//		System.out.println(c.message()); 
		
		r.message();
		c.message();
		
		
		
	}
}
	


