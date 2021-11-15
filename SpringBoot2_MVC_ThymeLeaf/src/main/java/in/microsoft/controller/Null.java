package in.microsoft.controller;

public class Null {
static int count =0;
	public static void main(String[] args) {
		if(count<3) {
			count++;
			main(null);  //not affecting here
		}else {
			return;
		}
    System.out.println("Hello world!");
	}

}
