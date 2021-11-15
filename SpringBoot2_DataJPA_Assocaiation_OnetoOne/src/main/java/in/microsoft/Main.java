package in.microsoft;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * String s1="Ganesh"; String s2="name".getClass().getSimpleName();
		 * System.out.println(s2);
		 */
		/*
		 * for(int i=0;i<10;i=i++) { //here i=i++ not incrementing anything
		 * System.out.println("i is "+i); //i+=1; System.out.println("post i is "+i);
		 * System.out.println("hello world!"); }
		 */
		
		/*
		 * try { System.out.println("heyy"); }catch(Exception e) { //parent class of all
		 * exceptions System.out.println(e); }catch(ArithmeticException e1) {
		 * System.out.println(e1); }finally { System.out.println("!"); }
		 */
		/*
		 * List list =new ArrayList(); list.add("hi"); list.add(1);
		 * 
		 * System.out.println(list.get(0) instanceof Object);
		 * System.out.println(list.get(1) instanceof Integer);
		 */
		
		try {
			System.out.println("A");
			badMethod();//thow new error will escape all into exception handling 
			System.out.println("B");
		}catch(Exception e) {
			System.out.println("C");
			
		}finally {
			System.out.println("D");
		}
		
		
		
		
		
		
		
		
		
		
	}

	private static void badMethod() {
		
		throw new Error();
	}

}
