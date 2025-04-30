package com.tnsif.variablesdemo;

public class Cal {

	//same method with different but para diff -- compile time over loading 
	   public int add(int a , int b) {
	    	  return a+b;
	      }
	   
	   public float add(float a , float b) {
	    	  return a+b;
	      }
	   
	   public String add(String a , String b) {
	    	  return a+b;
	      }
	   
	   
	   // constructor overloading 
	   Cal (String message){
		   message=message;
	   }
	   
	   Cal (int number){
		   number=number ;
	   }
	   
//	   //override 
//	   public St

	   
	// compile time 
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		//
	    
		Cal ob = new Cal(2);
		System.out.println(ob.add(1, 3));
		System.out.println(ob.add(2.4f, 2.6f));
		System.out.println(ob);
		Cal o = new Cal("dsd") ;
		System.out.println(o.toString());
		
		
		
		 
 		
		
		     
	}

}
