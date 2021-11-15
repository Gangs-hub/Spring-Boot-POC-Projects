package in.microsoft;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JdbcCon jd=new JdbcCon("gangs", "ok", 25);
		JdbcCon jk=new JdbcCon("gangs", "ok", 25);
		
		System.out.println(jd.equals(jk));
		//To compare two diff object data
		//we have to override equals
		System.out.println(jd==jk);
		
		System.out.println(jd.hashCode());
		System.out.println(jk.hashCode());
		
		//gives actuall hashcodes
		System.out.println(System.identityHashCode(jd));
		System.out.println(System.identityHashCode(jk));
		
		

	}

}
