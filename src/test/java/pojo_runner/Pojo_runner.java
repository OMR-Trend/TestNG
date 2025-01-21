package pojo_runner;

import pojo_class.Pojoo;

public class Pojo_runner {

	
	
	//1.extend 
	//2.static
	 //3.we can create a object for Pojoo in pojo_runner
	
	public static void main(String[] args) {
		
		Pojoo p = new Pojoo();
		
		System.out.println(p.Getters());
		System.out.println(p.setters(15));
		System.out.println(p.Getters());
		System.out.println(p.getB());
		System.out.println(p.setB(59));
		System.out.println(p.getB());
		
		
		
		
	}
	
	
}
