package in.microsoft.test;   

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.microsoft.entity.Student;

public class TestClass {

	public static void main(String[] args) {
		EntityTransaction tx=null;
		
		try {
		//load driver, support prep statement ,create connection
		
		//superinterface given by JPA API of SUN
		                          //its implementation provided by Hibernate
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("AppDB");
		
		System.out.println(emf.getClass().getName());
		
		//support operations excution,setdata
		EntityManager em=emf.createEntityManager();
		System.out.println(em.getClass().getName());
		
		tx=em.getTransaction();
		tx.begin();
		
		
		Student std=new Student();
		std.setStudentId(106);
		std.setStudentName("I am Ultimate Gangadhar Kadam, will soon in Microsoft!");
		std.setStudentFee(11.22);
		
		em.persist(std);
		tx.commit();
		}catch(Exception ex){
			ex.printStackTrace();
			tx.rollback();
			
		}
		

	}

}
