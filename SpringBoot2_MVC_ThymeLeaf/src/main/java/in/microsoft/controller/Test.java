package in.microsoft.controller;

public class Test {//Parent class

	
		
   //System.out.println("apple".compareTo("banana"));
	
     Object message() {
    	 return "Hello!";
     }
     
     public static void main(String[] args) {
     
     System.out.println(new Test().message()); //with constructor call
     System.out.println(new Test2().message());
     
	}

}
