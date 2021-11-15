package com.email.test;




import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import com.email.service.MyMailService;

@Component
public class EmailTestRunner implements CommandLineRunner {
    @Autowired
	private MyMailService service;
 //   @Autowired
   // private BuilderPatt patt;
	
	public void run(String... args) throws Exception {
		//Testing purpose
	//	patt.builder().id(11).name("hello").build();
		
		Resource file = new
				FileSystemResource("D:/Images/kola.jpg");
		
		boolean sent =service.send(
				"kadamgangadhar971@gmail.com",  //to
				
				new String[] {},//cc
				new String[] {}, //bcc
				"Welcome to Spring boot!",//subject
				"Hello User "+new Date() //body
				
			);
		
		if(sent) {
			System.out.println("Check in box");
		}else {
			System.out.println("Mail not sent!");
		}
		}
		

	}


