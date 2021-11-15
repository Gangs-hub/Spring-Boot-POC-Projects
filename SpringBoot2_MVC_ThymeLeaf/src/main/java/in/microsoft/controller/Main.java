package in.microsoft.controller;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Boolean>list=new ArrayList<>();
		
		list.add(true);  //0
		list.add(Boolean.parseBoolean("True")); //1
		list.add(Boolean.TRUE); //2
		System.out.print(list.size());
		System.out.print(list.get(1) instanceof Boolean);

	}

}
